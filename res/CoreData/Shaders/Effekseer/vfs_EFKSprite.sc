SSSS    �@♅�c�����?��q�A +�ҎxW�\�(E�G@�#�A���oJ�\��i C?}�f��du^���K�M��.O��I`����F����^C�������������H��0��ꜳcXgM�R��w��\��>�����.t!!��DW�����8�Y��J�`р�WCz#(H@c�,0;5��N�&FU
��~����!\9��{f���i�G��C+V�.)~�0�J���h��o��@�Q��\Ю��N�.�+A����+IMk	W�i��@ 4L�A�,���^{�T$dD��
g�ǭ{���\w1u�g�A��C�1Nc�p-�[�E��%t(-�_�;����ƴ�_��v���u�M!��B�3�"�6Ou�q;�Qd���f�V�>E�
$!+ū�H�cA�2�}�AT+��c`8�f����}�y���w����?/S�yHE�x���ܕW�y��'y��`�8�z���#�ƽp�w|�h,�;�_���9gY4rojection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 cTmeraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * cameraPosR;
    v_vaPosU = uMatProjection q cameraPosU;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_vaPosU.w

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInversed.x +mUVInversed.y * v_texcoord0.y;

}

#endif

#ifdef FS

$input v_color0
$input v_texcoord0
$input v_vaPos
$input v_vaPsR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uTexture0,0);

// Materials
unif�rm vec4 u_time;
// end materials
/// ----------  END UNIFORM


void main()
{
    vec4 _baseColor =  texture2D(uTexture0,�v_texcoord0.xy);

    gl_FragColor = v_color0 * _baseColor;
    if(gl_FragColor.w <= 0.0) discard;

}

#endif
