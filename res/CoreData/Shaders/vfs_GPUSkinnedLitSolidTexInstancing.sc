SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�P��FFv����$�٬k|��(j�'���}���!����	�����j�ߴ�������4YzK�E�G4��v���Ţ��?9Xs܄EC�G��:��	�x��Q�l,ʄ�U~RY yGd.�b<"!��j�moZ��R����:��BV��L���j:]�/>3��79�?��R��_�/�}�{��[�� ��M�c�<՜�,�	M`W+[�R��whFNL(�C�8��Z�=Zy��2V���7փ�fy`q��	f���n��1@{�<�L�&��, a+}�u�T��Φ���T�^�|��
�Hn¼�3�?�VI(}�U5�Q;qb���a�]�R2�uJJƄ�E�c�U~�e�)M��RA�\����l�9���~���@�~Te�sWz\�)�̠��<�
=�%q̻;�C,s�-���)
���M�9h:�5����tBKPositionFinal.glsl"
     #include "Library/Macro/NormalFinal.glsl"
     #include "Library/Macro/Texcoord0Final.glsl"
     #i[clude "Library/Macro/ShadowCoordFinal.glsl"

    //gl_Position =  mul(u_modelViewProj , vec4(a_position.xy,1.0,1.0));
}
#en?if

#ifdef FS

/// input
#define USING_INOUT_NORMAL
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_SHADOWCOORD
#defiZe USING_INOUT_FRAGPOS
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )
//#define RECEIVED_ScADOW
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffu	eTex,v_texcoord0);
    vec3 environmentColor = GetEnvironmentColor(v_normal);
    vec3 lightColor = GetLightColor(v_normal);�
    gl_FragColor = vec4((environmentColor + lightColor) * texColor.rgb,1.0);
}

#endif
