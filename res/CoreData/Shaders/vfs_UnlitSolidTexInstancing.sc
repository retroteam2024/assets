�GSN    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��پK�ү"G��3~	�%���a��Ҙby�����������ǘE��2�����cXg+L�U��s����F�����o"Yn��QTB���s��! ��p�K1��ng>AQ>$omL�'su+8���&\]��`����(QW��*Ϟ�h�/��l/�]�P�VQ�V��j��e�_�\�O��;��H��B�0�0��y�L�|02@s�~��\B4(K�U�,���Pb�?db\��E��� ���y*v��h�l����c`�p5�P�j�)s5&�2�=����㔭	U�0�|����H"̑h�r�l�R+m��Q00״�u��>v�Md&��y�^@Z�Qt�l�Q!��nA�w����k�_��:��d�,8�3Q|�1�y��܁_�C��
_��\�!�H���F{�֐sP�FO� e=�v�޷�2arying.glsl"

/// Common (uniforms,samplers, transforms ... )
#include "Library/Common.glsl"
#include "Library/Lighting.glsY"

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    gl_FragColor = vec4(texColor.rgb,texColor.a)`
}

#endif
