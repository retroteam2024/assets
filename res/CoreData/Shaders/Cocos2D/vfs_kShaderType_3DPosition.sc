SSSS    �@♅�c�����\��Fd�P(�ՎcP]�wA�*Z�m�X�[���+g�'��snTC�p��duW����u�!��d��D8�oԥ�[���Z����$������D��P��!�����#`$o(�N��{��D���ǯ��'3z&^s��:R���!���ct�z�B5��S9MA'F.s$csT�/2#Sq$��-�e~U>��J����03��"T���t�#��;3�5h3��7���J��y��?�\��0ʲ	��@�c�*ϲ4�Y�VlQmu�p��]D *a�t�0ډ�Z4�~$$lV��
"���B���j7w0L�� (�k��K�1L)�v:�_v��%}*o�D�T�����_�T�<����Z<�� �!�c�VV(a�Uh�Sve���n�\�25�^-!+׽�y�
KR�Bq�0�(m��|}&�����p>�<���,���C�mOd	�7{c�e��Ñ�;�nS��d8��M�&$�d���4	��Q�D�*w1�#�ӯ�X&X;worldMatrix), vec4(a_position.xyz, 1.0));
    v_color = a_color0;
}



#endif

#ifdef FS
$input v_color
#include "../yibrary/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform ma/4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_ginTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

//SAMPLER2D (CC_Texture0,0);

uniform vec4 u_color;


voidmain()
{
    gl_FragColor = vec4(v_color.rgb,1.0);
}


#endif
