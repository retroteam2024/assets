SSSS    �LE����%���̙F��Z%�S_:���jMQ�~�48�>j�S����+"�X��x~;g�x��f
0����(�ŤkD��R5����V���BO��͇	����̃@�����7�����~Xh/C�R��/p��G��$��̙�J;'smݕTq���!���>;˲D�f�Ϫ+]?D%=r?,lX�vs"88	���l^N	��h����6>��s~��s�2��C+V�.)~�0�J���i��y��@�G��9֥3��G�"�-��T�o�)wVbh�=��L4T�B����Zl�>$HQ��z������Zucu��Q3�>��M�� U`�}�G�0��Aa21��,Ϻ^���ݬ?N��)����]!��B�7�x�Ld&o�i�!}���i�>�RM�
n,���x�uC�Uj�h�@e��3l$�}����k�:���(���@GqP�yTF�1�����;�	0��6u��w�}w�l���lG��0�DC�NR�^�ګ�`)AX_SPLIT_COUNT
#define MAX_SPLIT_COUNT 3
#endif

// light position
uniform vec4 u_lightPosition;
// light direction
unifZrm vec4 u_lightDirection;
// light color
uniform vec4 u_lightColor;
// light info : type ,shadow split count
uniform vec4 ulightInfo;
// light view projections
uniform mat4 u_lightSpaceMatries[MAX_SPLIT_COUNT];
// shadow viewports (for split in onQ texture)
uniform mat4 u_shadowViewports[MAX_SPLIT_COUNT];
// shadow splits
uniform vec4 u_shadowSplits;
// direction lightcascaded
uniform vec4 u_lightShadowCascaded;
// cascaded viewport for shadow pass write
uniform vec4 u_cascadedViewport;

w
#if defined(SKINNING)
uniform vec4 u_matrixPalette[180];
#if !defined(SKINNING_JOINT_COUNT)
#define SKINNING_JOINT_COUNT 60�
#endif
#endif

#if defined GPU_SKINNING
uniform vec4 u_matrixPalette[2];
#endif


/// Fragment shader uniform

unifo�m vec4 u_sceneHemisphericColor[3];
uniform vec4 u_ambientColor;

uniform vec4 u_matDiffColor;
uniform vec4 u_matEmissiveCol(r;
uniform vec4 u_matEnvMapColor;
uniform vec4 u_matSpecColor;

#ifdef PBR
uniform vec4 cRoughness;
uniform vec4 cMetalli�;
uniform vec4 cLightRad;
uniform vec4 cLightLength;
#endif
