SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�P��FFv����$�٬k|��(j�'���}���!����	�����j�ߴ�������4YzK�E�G4��v���Ţ��?9Xs܄EC�G��:��	�x��Q�l,ʄ�U~RY yGd.�b<"!��j�moZ��R����:��BV���B���yS2c�b2}�1��T��e��y�X�S�P��1����.�N�pZ����3w,t�{��UT4&aV�F�-��R|�Zd%ȱDf������e!GS��+Z�&���%Hg�3�,a���+M|��2��M��ܔ�[��Q���)���_�A�OT,j�z�:Ue�����5A�Dzm+쯫)�dA�Ba�F�Alź||"�{��բk �{��2����?<�rY`�g���ؕO�1:��kL��q�&%�K���e��Q�"Q�"=�0��Ϭ~%Ddef FS

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transformF ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_dif=useTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,1.0);
}

#endif
