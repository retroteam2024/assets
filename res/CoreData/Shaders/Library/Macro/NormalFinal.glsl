SSSS    �n`��c�����Y��pPc�E{��Bp8�Qr�f�]��B���8"�+�
�r!{���jXT����-�γgH��D'���[����ND����G������B��K��`�����z\sY/���gą	��k�랙�^&rME܈ ]F�\Ƣp���Z^���r���hf.kT.�bs:%S���enq	��Ӡ��!��bhŘ�L�>��1vQ1� /r�q�&���+��o�� �@��7ѡW�Z�)�c���4��a9Rq2�r��\ju~3K��~���'�#'d\�I2���詘8~;&t��h�k����*Gm�uy�0g�	�-F�r�~�������	T��a�،�H>���=� �tZ1|�;�Q���X�]�:g�~k`0���x�9iA�TU��KXڷ=w2�>��̢k�'��,���R�lCK]�p^<t �=�B����L�\��2}��w�;6�}���^F���4�ZE�.3�,����~&D normal = mul(inverseTransposeWorldMatrix , normal);
    #else
    normal = mul(u_model[0], vec4(normal,0.0)).xyz;
    #endiS
#endif

    v_normal = normalize(normal.xyz);
