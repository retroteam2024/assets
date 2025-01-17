SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�P��FFv����$�٬k|��(j�'���}���!����	�����j�¿t���ք��vA�U��4_��K��9�����cBjǓ\WK��Y��GA�w;ЋU�`h���D6\OlN'K^p�8(��!� � �i����=��XF���U���|^�Kxz�>��V�n��j��d�[��8�����I�UV��?��|PqW7[�^��*%n�d�3��'�8,jB��G.������Zu08��K3�l��K��/Tm�3{�W�)͝d/}*2��9��D����U����P�6D��h�r�l�R+m��Q00״�u��>v�In-��d�(o]�\6�g�NB��3/k�1���p�u�ŷ<���[�RG@�3tg������Z�AT��d8��1�'4�i���E@��
�eM�nw�1�Ӫ�6knal.glsl"
}


#endif

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "LibrarL/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.g7sl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentCoXor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texCDlor.rgb,1.0);
}

#endif
