SSSS    �@♅�c�����\��Fd�P(�ՎcP]�wA�>V�\�L����05��n�8*>|�>��bB����%�h��>G��	_-������ËfV����\������B���J��t�܉��bQkt�E��Y��@�������}=^w��D�$����	�>,��/�z�LpX^x{^6AWi�#'%)\���`lS�F�f����,��b`���v���(*J�oN�P����j��j�D�q�v��$ȡ� �Q�;�R�0��19Ia .�^��lNyoz/�R�7��R/�2~%s��4k�����?v*~��3��ձbf�G0��Bʊ"
}52�	�=��k���U�F�)���r�R ���7�n�	g�	z�=>	ƣ�d�^�0{L�B;T���e�iA�n�h�\��va.�w���m�<�ʱ2����$+G�u\gR� �G���_���!{��}�rZt�c���{D���G�]s�f0��ӷ�y n
uniform mat4 u_viewProjMatrix;

void main()
{
    gl_Position = mul(mul(u_viewProj,CC_MVMatrix) , vec4(a_position.xyz, 1.));
    v_texCoord = a_texcoord0;
    v_texCoord.y = 1.0 - v_texCoord.y;

    vec3 _normalVector = a_normal;
}



#end2f

#ifdef FS
$input v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiVieCPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NorFalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (C9_Texture0,0);

uniform vec4 u_color;


void main()
{
    gl_FragColor = vec4(texture2D(CC_Texture0, v_texCoord).rgb,1.0)�
}


#endif
