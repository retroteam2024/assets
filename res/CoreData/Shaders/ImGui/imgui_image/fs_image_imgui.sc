SSSS    �Gꍕ�c�����V��V�-ux�τ`K�6<V�i�,��O���&�� �q0`z�<֋7Յ��'���&H��Fn�2���@�̧�!B�ᡝ���՗�Ȯj��4�ɣ��Gp~P�X��IFą\��-���ԥ
/roY��$}F���h�� �1;ג�u���bx,z:i? t:4�7=>>��}>+�9�r����--��FDʏ�h���rS2�(=|�0��E�D��d��^�H��?��i��J�,�2U��:�B�Fkm���VNre3O�Q�=���|P�?l]��j������} ,�&L���K��x,�}0�G�hɁ(X2�-�0��E�ԫ��m0��t���X�^-ڼ�;�-�\w*j�z�wS�̤�r�Y'�])-׾�s�j\�8�"�/j��wj-�|���l�2�ű:����jyu_�{_=z7�$��ɗ�;�_<��*}��M�$6�H���eL���&�IK�9n<�:�Р�Z n
void main()
{
	vec3 color = texture2DLod(s_texColor, v_texcoord0, u_imageLod).xyz;
	float alpha = 0.2 + 0.8*u_imageEnabled
	gl_FragColor = vec4(color, alpha);
}

