SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�P��FFv����$�٬k|��(j�'���}���!����	�����j�غn��	�����~S|W�E��X��H��d�ក�	7u"Yn��CK�j��Y��GN�" ՊQ�F���H>PZS
6EOv�(*��m�*nY��'����,��C]���Y���n5d�%>u�3�Y+�?��X��D�#�a�h���+�%�)�'�9��y�1�^`M-U�I��jfSZq�-�7���Jk�TslR��{�����RZ/k��h�k����,Ld�}y�
[�.Ж&2k��0��G�����N�_����U+��)���~6O-�x�vH���e�R�&:!�Gtn0���x�L9�:n�b�b��;&F�i���%A�v��2����SO~@�nC^X�*�#��Г_�%0��(6��a�kZt�-���*@����c*�&�P��i*ormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     include "Library/Macro/FragPosFinal.glsl"

}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (unifoFms,samplers, transforms ... )
//#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

vDid main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_norma);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.�);
}

#endif
