SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�P��FFv����$�٬k|��(j�'���}���!�椞����O��^�%�믒�yMj�L��6pÂ#��d�뙀�
X~ׁ^B�2����! � ��j�Y$���4PC">=:EO~�28��8�FEn,�k�$����1?��Z`ɉ�s�e��;'Q �o<�1�tt�|��(��d��\���?ï���7�>�6��|7*C3���VDx%G��7��Mv�7>'h_�� n�ʴ{�ީCq'8��}�H��Y��c)�3z�V�=ہkN^.=��'��I���҉I��}�ʗ�W`���p�F�e.�u�g���n�A�-lM�Kzs1���y�ju�^y�%�No��/k�2����f�1�����C�f	QS�nU^A
�*�����X�M>��(:��o�Ct�i���$����N�&R�^�P���vX
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, Aransforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{

    vec3 environmentColo) = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + enviFonmentColor) * u_matDiffColor.rgb,1.0);
}

#endif
