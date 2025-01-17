SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�P��FFv����$�٬k|��(j�'���}���!����	�����j�ߴ�������4TqN�D��61��[��2�҉��R<\o��\T�EƢ^��GA�8!яP�o���G9[
T.SHw�)5��,�)X��b����
4��Y\���D�	��c�b?v�4�^�%��@��E�"�m�a���+�3�.�`�:�<�7�Wx[*T�H��~uUMm�*�}��Sz�qhIY��p����[6$t��G�l���� Nd�|7�W@�!ً9ags��?��N�����N�V�����R ��%���puG�<�R{ٳ�b��6w�X`.��d�@a_�\:��(l��3b*�|�Ӟ�~l�u���~���A�jBy�PSg �j�����f�
-��*^��s�g0�a���)	�ƽZ�K@�dx��Τ�)`cro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
8
}
#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOOR
#define USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#define RECE}VED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(utdiffuseTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_noral);

    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
