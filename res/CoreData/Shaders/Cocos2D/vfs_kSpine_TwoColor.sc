SSSS    �@♅�c�����?��q�A +�ҎxW�:>�%Z�\�P�O���3(�I�C�C &-f�l������4�B��?L��	B2�N���^�����ף�阷���D��R��`���Š~_mP���g��F��$�����|tXYtہBJ�
��gϫ+1�5эL�/h���H6ZGl6|9],Bz�&;81���DkH��3����13��dd���u�j��n#�5)z�f�s���uțf���j�� ����[�N�*�6��1xK0CY�B��TS}\(G�j�Á�Mf�/e>=��	k������AG8 [��
a� ��C�*Y2�,�S�:��=	qs�<�
��M�蚈�	\��2��L�x����!�6O{�}�\Х�'�p�z�Ctde���e�iA�n�h�#@��ra/��˨�l� ��1��O�k<G�jSb, �/���П�v6��du��|�`Zt� ���)	��)�AX�ox�t�
���j_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
	v_light = a_color0;
	v_dark = a_color1;
	v_texCoord = a_texcoord0

}

#endif



#ifdef FS
$input v_texCoord, v_light, v_dark

#include "../Library/Base/common.sh"

uniform mat4 CCPMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiVieCMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniforF vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);

void main()
{
	vec4 texColor = texture2D(CC_Texture0, v_texCoord);
	floa alpha = texColor.a * v_light.a;
	gl_FragColor.a = alpha;
	gl_FragColor.rgb = (1.0 - texColor.rgb) * v_dark.rgb * alpha + tex�olor.rgb * v_light.rgb;

}

#endif
