SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��پK�٪'\��F� ���K����_R�������������-��o�𿞜bIh�E��z��z���͢��%!OtY�� t�m��=��
�wv�G�u���@"LD+uz!`#4�OYxH~G���fd@��a����d_z��wg؝�s�9��gpG�Kxz�>��V�n��j��q�D��8����.�N�)�y��21	ia���4)(L�K�:���sf�08|��p����\vq��	=��� ��c)�3z�V�=ہkN^.=��'��I���ҍB��`Ἰ�Z"���>�A�D6O-��ve���a�V�S1� q��b�sG�:;�n�Kfʿ@F�M��ܞQ>��ʑ�½/�<OrQ�i^5^>�'��Ԗ�W�
7��#t��0�CZt�"��fD��Y[�FE�s5�x�ѵ�t^H transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = text@re2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a);
}

#endif
