SSSS    �@♅�c�����\��Fd�P(�ՎcP]�wA�>V�\�L����0+�
�n�8*>|�>��mu[����5�ۦ9��9Y%�!���V����&=�殔�������Ȳx��!�����7jK�O��4�����ə��(r7[J��BN�<��h�� �1;ג�u���bx,g-/o$73�,:1#
���=*+�+�W����-a��cg�s�j��=j-�f�)�/���W����i�t��\Ю��N�.�+F���,�.t^h.{�o��*/K�H�3���\;�7QY��\������XTn&{��&P�2��v��&�f7�Z�%��.&g� �1��A�����T��`謈�n��=�3�(�Tt5�q�R{ٳ�b��q:.�Hk`,���j�)P�]u�e�Q!��fa"�}����d�u�֨7���P�uk}F�uBJv�,�S��Љ�qi"��d8��u��d���g	����]s�d/�&���oUD, vec4(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS

$inEut v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPM:trix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_Normalyatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_TNxture0,0);




void main()
{
    vec4 c = texture2D(CC_Texture0, v_texCoord);
    c = v_fragmentColor * c;
    gl_Frag9olor.xyz = vec3(0.2126*c.r + 0.7152*c.g + 0.0722*c.b);
    gl_FragColor.w = c.w;
}




#endif
