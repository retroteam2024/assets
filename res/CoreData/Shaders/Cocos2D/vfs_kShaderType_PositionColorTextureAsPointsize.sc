�GSN    �@♅�c�����\��Fd�P(�ՎcP]�wA�>V�\�L����0+�
�n�8*>|�>��mu[����5�ۦ9$�l)����Wٖ��{�굓��������J��n�����7jK�O��4�����ԡ��ci!ǉVH�
��2��H-�ГQ�B���l1AC4 )RL�+58<G���)I7�0�f����~P��oĉ�!�+ i{1�^�)��{ښi��d��_�]���)��J�*�(8͋��5ad0>!���QA{x,�F�m���`A�<+i}��k㝛|��Sj.8��'�"��v��&�f7�Z�%��.&g� �7��A�����T��`謈�n��=�=��T^~�u�}���d��J0�D}n3����cF�Y~�y�f��3z�~����k�_��8����~R(�CLp"�*�>��ˎN�qiTˆ+qƳ� 9V� ک�	�ƽ�xC�u1�:�B���.@l(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    //gl_PointSize = a_texcoord0.x;
    v_fragmentColor = vec4(ajcolor0.rgb * a_color0.a * u_alpha.x, a_color0.a * u_alpha.x);
}


#endif

#ifdef FS
$input v_fragmentColor


#include{"../Library/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniRorm mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vNc4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{
    gl_FragColor = v_fragmentColor;
}w


#endif
