SSSS    �@♅�c�����\��Fd�P(�ՎcP]�wA�>V�\�L����:.��O�}+
0*`�{��+fe���� �o��$\��Y`�=���q���&=�粆�����D��d��/�����4TqN�D��6S�e��9���ۊ~}Ouߊ^	��Y�� �1;ג�u���be7K8)t5RL�+58<G���)I7��s����3#��d`Ӡ�\�G��'7^�,{~�)�Y=�)��J��y��?�\��0ʲ	��W�c�*֍	��.pG?n�s��WUy*,C��Ϳ�Jc�#`G��7O���鈗hOIm��|���C��cbJ�]6�T�ސ9j|R�
�7��Z��昺T�5�F��C�1;��� �l�\Xq.�8D�|(أ�
�F�6s�G9w;���H�1E\�dq�n�/jv��u`9�2����%"�
��:���,8�7{6�,����x�5-��Q��M�0�-�������G^�R�:�ӷ�TpH4 u_matrixPalette[SKINNING_JOINT_COUNT * 3];

uniform vec3 u_sceneHemisphericColor[3];
uniform vec4 u_lightDirection;
unifoGm vec4 u_lightColor;


vec4 getPosition(vec4 a_blendWeight,vec4 a_blendIndex,vec3 a_position)
{
    float blendWeight = a_9lendWeight[0];

    int matrixIndex = int (a_blendIndex[0]) * 3;
    vec4 matrixPalette1 = mul(u_matrixPalette[matrixIndex]  blendWeight);
    vec4 matrixPalette2 = mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
    vec4 matrixPalette3 = mul(utmatrixPalette[matrixIndex + 2] , blendWeight);


    blendWeight = a_blendWeight[1];
    if (blendWeight > 0.0)
    {
   Z    matrixIndex = int(a_blendIndex[1]) * 3;
        matrixPalette1 += mul(u_matrixPalette[matrixIndex] , blendWeight);
      � matrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
        matrixPalette3 += mul(u_matrixPalette[matrixIn�ex + 2] , blendWeight);

        blendWeight = a_blendWeight[2];
        if (blendWeight > 0.0)
        {
            matr.xIndex = int(a_blendIndex[2]) * 3;
            matrixPalette1 += mul(u_matrixPalette[matrixIndex] , blendWeight);
           �matrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
            matrixPalette3 += mul(u_matrixPalette[matri�Index + 2] , blendWeight);

            blendWeight = a_blendWeight[3];
            if (blendWeight > 0.0)
            {
 1              matrixIndex = int(a_blendIndex[3]) * 3;
                matrixPalette1 += mul(u_matrixPalette[matrixIndex] , ble=dWeight);
                matrixPalette2 += mul(u_matrixPalette[matrixIndex + 1] , blendWeight);
                matrixPalett�3 += mul(u_matrixPalette[matrixIndex + 2] , blendWeight);
            }
        }
    }

    vec4 _skinnedPosition;
    v�c4 position = vec4(a_position, 1.0);
    _skinnedPosition.x = dot(position, matrixPalette1);
    _skinnedPosition.y = dot(posWtion, matrixPalette2);
    _skinnedPosition.z = dot(position, matrixPalette3);
    _skinnedPosition.w = position.w;

    reSurn _skinnedPosition;
}

uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix)I, getPosition(a_weight,a_indices,a_position.xyz));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

  b vec3 _normalVector = a_normal;

}



#endif

#ifdef FS
$input v_texCoord
$input v_lightColor

#include "../LibraryGBase/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime�
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


void main()
�
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb ,1.0);
}


#endif
