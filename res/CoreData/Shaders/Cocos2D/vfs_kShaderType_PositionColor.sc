SSSS    �@♅�c�����\��Fd�P(�ՎcP]�wA�*Z�m�X�[���+g�'��{0:J�r��7�Ӏ�"�ӬkԕIa)�������T�媝	��Հ�� ���N��2꿧��#\!}�m��f��$��%�⃆�Qz&:�-}R���:��8#�#&̇~�I^���O9SX!{p,8!z�*0��� I� �u����0Gz��ID���`�8��rS2�(=|�0��B�D��~��d�L�� ����[�w�dx��7��.tin�=��gi{x,C�j�*����?#c_��Gt�ŢVҐ�au&#��}���O��&B=�P�,\�։.WM*��1�������#y�5�a���6D���=�!�O^&:�8X�#sګ�6�>�R�Cn,���j�Z&F�Fq�|�Pi��g}"�)���s�1��7Ϯ�/�d+�<y#"�6������5�1t��M� 2	����h]���U0�wa�8`,�=�V��cNP(a_position.xyz,1.0));
    v_fragmentColor = a_color0;
}


#endif

#ifdef FS
$input v_fragmentColor


#include "../L\brary/Base/common.sh"


uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform m:t4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CCkSinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;


void main()
{
    gl_FragColor = v_fragmentColor;
}


endif
