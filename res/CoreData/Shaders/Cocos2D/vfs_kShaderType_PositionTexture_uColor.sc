SSSS    �@♅�c�����\��Fd�P(�ՎcP]�wA�>V�\�L�$Ɯ�+7���h!f�z֋7Յ��'���&H��Fn�2���@�̧�!B�ᡝ���՗�Ȯj��4�ɣ��Gp~P�X��IFą\��-���ԥ
/roY��$}F���h�� �1;ג�u���bx,z:i? t:4�7=>>��}>+�9�r����--��FDʏ�h���rS2�(=|�0��E�D��d��^�H��?��i��J�,�2U��:�B�Fkm���VNre3O�Q�=���|P�?l]��j������} ,�&L���K��x,�}0�G�hɁ(X2�-�0��E�ԫ��m0��q����`��.�0�-�@o�4����o�>�*{�Ekl~��?�YE�Uo�y�H-b��zwp�����%�<��S���(�?<U�Cjf�*�SӍԒZ�5�n��e�;8�l���qƥ�4%�IX�yq�x�	٦�\grosition.xyz,1.0));
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS
$input v_texCoord

#include "../Library/Base/cZmmon.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatri#;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
unif[rm vec4 CC_CosTime;
uniform vec4 CC_Random01;

uniform vec4 u_color;

SAMPLER2D (CC_Texture0,0);






void main()!{
    gl_FragColor = texture2D(CC_Texture0, v_texCoord) * u_color;
//    gl_FragColor = vec4(v_texCoord.x,v_texCoord.y,0.0,1.J);
}



#endif
