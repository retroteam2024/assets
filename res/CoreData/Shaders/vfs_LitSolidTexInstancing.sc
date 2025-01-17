SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�P��FFv����$�٬k|��(j�'���}���!����	�����j�¿t���ք��vA�U��4_��K��9�����cBjǓ\WK��Y��GA�w;ЋU�`h���D6\OlN'K^p�8(��!� � �i����=��XF���U���|^�Kxw�;��#��I��B�8�f�z���'�.�g�I�;��7�B�PqC<S�R��gaFKr�t�T���\c�4j'|��c�߹ ��\m��	1�k���%Hg�3�,a���+Mp�P���E���լS�����X�I/��� �?�k.�v�|���'��=g�S6B1��e�	j@���Tj��~n"�:����k�u���}���N�{C<�uXt����Y�0��q��~�.;�/���)	�ƾ�DY�!z�=�ݷ�[KLro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
    #include "Library/Macro/FragPosFinal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USIG_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common uniforms,samplers, transforms ... )
#define RECEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"!
void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentColor(v%normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.�gb,1.0);
}

#endif
