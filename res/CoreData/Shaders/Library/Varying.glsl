SSSS    �@♅�c�����j��5&2Z�o-���Q�6=�"P�6�q����{(���<<0!{���'����/���A	ڛF)����t�������������B��K��`���ɉyYv/���p��#��h�∑�Q+Hb]��<r�8����Xc�wt���r���w8p
l{=iyuI�6s!8?��� H�F�b����Iyz��6*�d�j��DTN�az�-�^�)��u��g�}��	��8���k�F�'�9x��S��8|Y$6I�S��qi[_}�b����{?�~qj%��f��� �ީT8c<��c���}�;Bf�a=�r?�h��h	|#6�r�~��͌����%����X�R ���$�8�AX*a�+�{2\H���i�Z�RA�D}h8����`W�V8�X�l'\��\Z�F��ЄJ3�d���~���K�{Cz�O7{5\R�a���̓�#<��+w��#�Cw^�-�m@��YS��e=�t�,�ρT&@input v_texcoord1
    #endif
#endif

#ifdef USING_INOUT_FRAGPOS
    #ifdef VS
    $output v_FragPos
    #endif
    #ifdPf FS
    $input v_FragPos
    #endif
#endif

#ifdef USING_INOUT_SHADOWCOORD
    #ifdef VS
    $output v_shadowcoord
   {#endif
    #ifdef FS
    $input v_shadowcoord
    #endif
#endif

#ifdef USING_INOUT_POSITION
#ifdef VS
$output v_positi[n
#endif
#ifdef FS
$input v_position
#endif
#endif
