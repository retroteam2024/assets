SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�P��FFv����$�٬k|��(j�'���}���!����	�����j�ߴ�������4TqN�D��61��[��2�҉��R<\o��\T�EƢ^��GA�8!яP�o���G9[
T.SHw�)5��,�)X��b����
4��Y\���D�	��c�b?v�4�^�%��@��E�"�m�a���+�3�.�`�1��=�B�p]vh�2��J^}d&�K�2��2�[~jF_��l������Gkc4�r���P��c'�3p�u�-ٍ%	2 � ���f�����CS��g���Z�R,���}�#�TT+ �h�Sve���n��>|�%���+�N&�^{�~�G@!��q}*�k��w����*���d�qGp�pI7qx�e�SΎЉU�	<��q��s�0x3�n���GF���5�FM�[f4�8�r��T&Ginclude "Library/Macro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
}
#endif

#ifdef FS

///input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#include "Library/Varying.gl(l"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

voidmain()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
