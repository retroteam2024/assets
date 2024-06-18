�GSN    �n`��Î&�����s��0	i�R_<���~_�yr�K?�W��K°��,�7�D 6)�{��~u_���b�Ѡ%L��	X2����V����XR����m������H���B��/���ʚHIzA�O��$S��$��A�����;Ibƒ Ut���%��ZF�ed��	�&Q�Ď,ZO*2s(IEoI�6 >4G���!<X�V�3˭��m~P˽so�!�?��<*k�${e�>�QH�F��+��;�G�?�
��0̮�2�V� ��y��h1kan�o��Q]q&a��q���G{�4lJ��G-������ };l�� @��M��
Oy�g
�P�B��.
{):��*��R��昺T��b����^bέL�r�l�LO5{�(r�;qb�̊c�U�1pB�iXO���T�/Uv�rJ�L�v.F��3?e�'��`�;멍���k�ZyO{�Ye2Z1"��C�����0��dK��\� ;�^���Vjʫ�&1��@R�^�u���eDRGBtoYIQ(vec3 RGB){
	const mat3 yiqmat = mat3(
		0.2989, 0.5870, 0.1140,
		0.5959, -0.2744, -0.3216,
		0.2115, -0.5229, 0.314);
	return RGB * yiqmat;
}

vec3 YIQtoRGB(vec3 YIQ){
	const mat3 rgbmat = mat3(
		1.0, 0.956, 0.6210,
		1.0, -0.2720, v0.6474,
		1.0, -1.1060, 1.7046);
	return YIQ * rgbmat;
}

void main_()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_COMP_A, gCANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIGHTNESS+ dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z, 1.0)A
}