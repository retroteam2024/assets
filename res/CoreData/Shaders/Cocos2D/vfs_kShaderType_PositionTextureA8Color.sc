SSSS    �@♅�c�����\��Fd�P(�ՎcP]�wA�>V�\�L����0+�
�n�8*>|�>��bB����%�B��-[��H.�!���@����&=�殔�������Ȳx��!�����7jK�O��4�����ə��(r7[J��BN�<��h�� �1;ג�u���bx,g-/o$73�,:1#
���=*+�+�W����-a��cg�s�j��=j-�f�)�/���W����i�t��\Ю��N�.�+F���,�.t^h.{�o��*/K�H�3���\;�7QY��\������XTn&{��&P�2��v��&�f7�Z�%��.&g� �1��A�����T��`謈�n��=�3�(�Tt5�q�R{ٳ�b��q:.�Hk`,���j�)P�]u�e�Q!��fa"�}����d�u�֨7���P�uk}F�uBJv�,�S��Љ�qi"��d8��u��d���g	����EY�]t�=���KLrix,CC_MVMatrix) , vec4(a_position.xyz,1.0));
    v_texCoord = a_texcoord0;
    v_fragmentColor = a_color0;
}


#endif
?#ifdef FS
$input v_texCoord, v_fragmentColor

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform mat4{CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniformmat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01;

xAMPLER2D (CC_Texture0,0);




void main()
{
     gl_FragColor = vec4( v_fragmentColor.rgb,v_fragmentColor.a) * texture2DRCC_Texture0, v_texCoord).a ;
}



#endif
