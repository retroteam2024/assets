SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�P��FFv����$�٬k|��(j�'���}���!�椞����O��^�%�믒�yMj�L��6pÂ#��d�뙀�
X~ׁ^B�2����! � ��j�Y$���4PC">=:EO~�28��8�FEn,�k�$����*z��_G��O���y*�\��tt���n��+�$�|�v���;�3�d��R��7��8|&/s�o��ABk3[�I�p��S-�~\@*�$m������[~,j��E?���L�,Sd�3w�Q�E��"q+*��|��J����#U��|���C�h�=�(�TZ,`�R�
vH��'�Z�<y�O9#��j�)~�Sj�$�Mj��|a�|����i�w���~����qEpG�ySY�$�
��؄D�S-6��%t��|�%y�~���	�ƽYP�FO� e=�v�޷�)acro/Texcoord0Final.glsl"
     #include "Library/Macro/ShadowCoordFinal.glsl"
     #include "Library/Macro/FragPosFinal.glsl"8
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
#define REwEIVED_SHADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{

    vec3 environmentColor =GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);

    gl_FragColor = vec4((lightColor + environentColor) * u_matDiffColor.rgb ,1.0);
}

#endif
