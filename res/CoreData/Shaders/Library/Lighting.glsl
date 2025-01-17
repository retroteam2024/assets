SSSS    �@Ⓞ�%э���a��###V�*_{���h[�x{X�g�p4�3�q����H�i�<TC}*l�w��+Tj�����*��z$�F`����\��̔by�׋� �����������&��ʠ^zW6}�y��GpìL��"�����R}6I|��7sb�1����)*� Y��L�w	ѐ�rfK(4jc`rU�OYt?��m� J�U�k��ט29��w%ݞ�2�(��%1Y�5r�&�s^�V�b��y�W��	��}��U�Q�W�c���S�o�*|\7CY�p��LB\o,K�W�;���sf�%bsU��Gl������V w11���A���� )�a6�Q�'Ӌ9L/g)��v��[�����W��z����T"��9��|�N}�u�9wƶ�b�Z�z�XB1���'�1uP�^}�n�Ks��af(�}���5<�gӠ�S����iC�oQV�7�N��܄�	<*��*}���:'����fE��H.�q� ^+�1����u]ericColor[1][1],u_sceneHemisphericColor[1][2]);
    vec3 equatorColor = vec3(u_sceneHemisphericColor[2][0],u_sceneHemisphericCZlor[2][1],u_sceneHemisphericColor[2][2]);

    vec3 worldUp = vec3(0.0,1.0,0.0);
    float skyGroundDotMul = 2.5;
    float{minEquatorMix = 0.5;
    float equatorColorBlur = 0.33;

    float upDot = dot(normalVector, worldUp);

    float adjustedpot = upDot * skyGroundDotMul;
    vec3 skyGroundColor = lerp(groundColor, skyColor, saturate((adjustedDot + 1.0) * 0.5));

   //Work out equator lights brightness
    float equatorBright = saturate(dot(equatorColor, equatorColor));

    //Blur equaor color with sky and ground colors based on how bright it is.
    vec3 equatorBlurredColor = lerp(equatorColor, saturate(equa�orColor + groundColor + skyColor), equatorBright * equatorColorBlur);

    //Work out 3 way lerp inc equator light
    float�smoothDot = pow(abs(upDot), 1.0);
    vec3 equatorColor2 = lerp(equatorBlurredColor, groundColor, smoothDot) * step(upDot, 0) l lerp(equatorBlurredColor, skyColor, smoothDot) * step(0, upDot);


    return lerp(skyGroundColor, equatorColor2, saturate(�quatorBright + minEquatorMix)) * 0.75;

    //return groundColor * -normalVector.y + skyColor * normalVector.y + equatorColor�* (1,0 - abs(normalVector.y));
}


float GetDiffuseDirectionLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.xyz;
 1  return max(dot(normal,normalize(dir) ), 0.0);
}

float GetDiffuseLight(vec3 normal)
{
    vec3 dir = -u_lightDirection.x*z;
    return max(dot(normal,normalize(dir) ), 0.0);
}

vec3 GetEnvironmentColor(vec3 normal)
{
    float ambientStrenght�= u_ambientColor.w;
    return ComputeHemisphericLight(normal);
}

float GetLightShadow()
{
    #ifdef RECEIVED_SHADOW
 �      return GetShadow();
    #else
        return 1.0;
    #endif
}

vec3 GetLightColor(vec3 normal)
{
    int lightTyNe = int(u_lightInfo.x);

    float diff = (lightType == DIRECTION_LIGHT)?GetDiffuseDirectionLight(normal):GetDiffuseLight(norJal);
    float shadow = GetLightShadow();
    return diff * shadow * u_lightColor.rgb;
}


