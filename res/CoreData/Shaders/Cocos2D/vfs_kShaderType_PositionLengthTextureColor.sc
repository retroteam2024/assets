SSSS    �@♅�c�����\��Fd�P(�ՎcP]�wA�>V�\�L����0+�
�n�8*>|�>��mu[����5�ۦ9��9Y%�!���V����^Y�
���֕�n�ԡj��2�����bSvM�M�u	��j���蘝�la{ƕH|�:�Y���%9��D� E��lx^>2evdtW�$<%
q
��T�JIc%�6�f����~P��oĉ�!�+ i{1�47g��	� ��f��b�,�o�$޶8̦��N�7�6؄��=ureh�e��2Rzc'M�J�(냮L�+#hU��mw���㾃C{w8��:@���O��N+|�z?�X�>ڇLQ ��
��M�蚈�	\��2��L�x���6�!� H�qn�t���b��*J�Zq`e����hP�E|�+�N,��q}*�k��`N�:��0��� �+G�u\gR�$�G���_�3+��	y��{�rZt����m	��[�%&�xx�t�К�uDion = mul(mul(u_viewProjMatrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = vec4(a_color0.rgb * a_color0.a* u_alpha.x, a_color0.a * u_alpha.x);;
    v_texCoord = a_texcoord0;
}



#endif

#ifdef FS
$input v_fragmentColor, v_/exCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 Ch_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);


voidZmain()
{
    // gl_FragColor = v_fragmentColor * texture2D(CC_Texture0, v_texCoord);

    gl_FragColor = v_fragmentColor * �tep(0.0, 1.0 - length(v_texCoord));
}


#endif
