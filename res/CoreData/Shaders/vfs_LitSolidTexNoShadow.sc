SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�P��FFv����$�٬k|��(j�'���}���!�椞����O��^�%�믒�yMj�L��6pÂ#��d�뙀�
X~ׁ^B�2����! � ��j�Y$���4PC">=:EO~�28��8�FEn,�k�$����1?��Z`ɉ�s�e��;'Q �o<�1�tt�|��(��d��\���?ï���7�>�6��|7*C3���VDx%G��7��Mv�7>'h_�� n�ʴ{�ީCq'8��}�H��Y��c)�3z�V�=ہkN^.=��'��I���҉I��}�ʗ�W`���p�F�e.�u�g���n�A�-lM�Kzs1���y�ju�^y�%�No��/k�2����f�1�����C�f	QS�nU^A
�*�����X�M>��(:��o�CZt��m@��ty�AJ�gx��u�ώ[)nput
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,sampleGs, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = te#ture2D(u_diffuseTex,v_texcoord0);

    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightwolor(v_normal);

    gl_FragColor = vec4((lightColor + environmentColor) * texColor.rgb,1.0);
}

#endif
