SSSS    �@♅�c�����?��q�A +�ҎxW�\�(E�G@�#�A���oJ�\��i C?g�l��g
0����4�B֖?H��C4�h���B����tC���񍯫�D���S������xO{S/�-��;]��O��.�����o_&>ݒ@R�G��0���Z^��P�d���~$PI#4o)Y�7''%G���qiS��
����0/��`V���m���m1M�4/3�������~��F�_��9׬ �l��6�/ ��/�5�.u[Fn�r��HR`*7}�D�;��i�y[il^��f���X���\j"j��'r���M��,O'�{{�u8�=э-`*��j��w��⑽-[��j����R(���?�8�Nx�l�}%Բ�n��Uh� lo7��f�gG�m�j�an��r4F�g����w�8���~���V�mIvW�hS{G�0���ˊ� m�N��d�;$�6���_��Y�AB�\R�Y�r��T&[c3 worldPos = a_position.xyz;
    // uv
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUV|nversed.x + mUVInversed.y * v_texcoord0.y;
    v_texcoord1 = vec4(a_texcoord1.x,a_texcoord1.y,0.0,0.0);
    v_texcoord1.y = mVInversed.x + mUVInversed.y * v_texcoord1.y;

    // NBT
    vec3 worldNormal = (a_normal - vec3(0.5, 0.5, 0.5)) * 2.0;
   vec3 worldTangent = (a_tangent - vec3(0.5, 0.5, 0.5)) * 2.0;
    vec3 worldBinormal = cross(worldNormal, worldTangent);

   v_WorldN = worldNormal;
    v_WorldB = worldBinormal;
    v_WorldT = worldTangent;
    vec3 pixelNormalDir = vec3(0.5, 0.5, K.0);

   vec4 cameraPos = uMatCamera * vec4(worldPos, 1.0);
   	cameraPos = cameraPos / cameraPos.w;

   	gl_Position = uM�tProjection * cameraPos;

    v_WorldP = worldPos;
    v_color0 = a_color0;

    v_ScreenUV.xy = gl_Position.xy / gl_Posit�on.w;
    v_ScreenUV.xy = vec2(v_ScreenUV.x + 1.0, v_ScreenUV.y + 1.0) * 0.5;
}

#endif


#ifdef FS
$input v_color0
$i)put v_texcoord0
$input v_texcoord1
$input v_WorldP
$input v_WorldN
$input v_WorldT
$input v_WorldB
$input v_ScreenUV

/�/ ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(ColorTexture,0);
SAMPLER2D(NormalTexture,1);

uniform vec� LightDirection;
uniform vec4 LightColor;
uniform vec4 LightAmbient;

// Materials
uniform vec4 u_time;
// end materials/// ----------  END UNIFORM


void main()
{

    vec3 texNormal = (texture2D(NormalTexture, v_texcoord0.xy).xyz - 0.5) * a.0;
    mat3 normalMatrix = mat3(v_WorldT.xyz, v_WorldB.xyz, v_WorldN.xyz );
    vec3 localNormal = normalize( normalMatrix *�texNormal );
    float diffuse = max(0.0, dot(localNormal, LightDirection.xyz));

    gl_FragColor = v_color0 * texture2D(Co�orTexture, v_texcoord0.xy);
    gl_FragColor.xyz = gl_FragColor.xyz * (LightColor.xyz * diffuse + LightAmbient.xyz);

    ifgl_FragColor.w <= 0.0) discard;

}

#endif
