�GSN    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��پK�٪'\��Fn�M���@����}R����.���֏�A���*��J���ʃbIoV�*�q��L���ʫ��?1NsN��1h�#��Ý�"0���:J��S1G:o4 bf�. ;E\m��O�&*��iӵ��-5��e)���s�$��&,U�ou=�t�s]���r��+�Y��@��7׹K��N�-�8�{�h�VoPm:�|�� :/��~���SP�"#qY��G?������jw0q��
}�����s2�y�_�>��.q(0��~��I�����U��<���u�FC��6�*�36O-��2:;�̤��|�_mT���m� c�cQ�L�k.L��L[�Q����5l�v��2����13~�~Hg]�$�
����Q�{��I��=�
8�b���|G���_�q4�&�S���h^orms ... )
#include "../Library/Common.glsl"
#include "../Library/Lighting.glsl"

void main()
{
    vec4 texColor = textuGe2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = texColor;
}

#endif
