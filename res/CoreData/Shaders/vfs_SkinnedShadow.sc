SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�M��EIs���b�ԥ>M��Da)�������NO�淇����́ ���I��5���Ƞ~_mP���f��N��'�����|t4}:�]H�G��=���$t��Q�uג�S=FZbu=dd"]�$:9q4��.�@D{e�E�i����!Sx��t{ʉ�.�%��&0	�271�W�s���j��e�^�8�$��v��G��O�'�Wײ;��%6re h�2��KN`c.L�N�?���S|�V\@%�H"������nck��v�k���,@}�fy�_�$�${36��&���ˠ��O�X�)���X�]"���$�q�\)Q�h�{���,��o<B�
+/n�ǁ+�N`_�Ql��]#��pn8�s����l�%����۶/�?<T�s[5C�x���ؔU�=��!o��`�f#� ���)O��S��Ut�5�ݡ�PDwport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x= u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Common.gl(l"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
