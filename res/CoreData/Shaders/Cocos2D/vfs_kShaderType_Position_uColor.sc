SSSS    �@♅�c�����\��Fd�P(�ՎcP|��/S�A��Z�Ӷ�5��uXSD|�w��yj����a�!�>E��0D%�2���@����v�������ρ�L��d���ҫ��~E$o(�N��{��D���ǯ��'.V3Xh۟I=-�	��<��H�#`��f�YȀ�w9PgP,~hA�vlj[���{g��'����+7��[h߉�y�G��'7^�,{e�>�Y=�)��j����[�F��vӥ�A�`��1!�<�o�)wVbh�=��[4I}�H�
���?#c_��Gt�ŢVҐ�gv'w��T(�k���� M|�vy�Q�ֆ9`>p��;��G�����R�{�����T<���&�l�fM,k�+i�_ǯ�<�9�Uc�N9l?ᤣ"�d}>�8�+�N?S��z{"�|�ǳ�p�8���+���G�OTsX�}N|^��>��ؓD�Jy��2}��:�'�d���g���US��\:U�)�u�ςhIf

#ifdef FS

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
unifoGm mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform{vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

uniform vec4 u_color;

void mUin()
{
    gl_FragColor = u_color;
}


#endif
