SSSS    �@♅�c�����\��Fd�P(�ՎcP]�wA�>V�\�L����0+�
�n�8*>|�>��mu[����5�ۦ9��9Y%�!���V����^Y�
���֕�n�ԡj��2�����bSvM�M�u	��j���蘝�la{ƕH|�:�Y���%9��D� E��lx^>2evdtW�$<%
q
��T�JIc%�6�f����~P��oĉ�!�+ i{1�47g��	� ��f��b�,�o�$޶8̦��N�7�6؄��=ureh�e��2Rzc'M�J�(냮L�+#hU��mw���㾃C{w8��:@���O��N+|�z?�X�>ڇLQ ��
��M�蚈�	\��2��L�x���6�!� H�q8�qѣ�%��| �Kkxqʫ�n�i^�_v�x� m	��fa"�}����d�u�֨7���P�uk}F�uBJv�3���Ԇ_�TJTˋI��2�.;!�b���`F�ƠY�D� mp��ٲ�iG)atrix,CC_MVMatrix) , vec4(a_position.xyz, 1.0));
    v_fragmentColor = a_color0;
    v_texCoord = a_texcoord0;
}



#end\f

#ifdef FS
$input v_fragmentColor, v_texCoord

#include "../Library/Base/common.sh"

uniform mat4 CC_PMatrix;
uniform{mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatrix;
uniform mat4 CC_MultiViewMVPMatrix[4];
un]form mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
uniform vec4 CC_CosTime;
uniform vec4 CC_Random01

SAMPLER2D (CC_Texture0,0);

uniform vec4 u_textColor;


void main()
{
    // gl_FragColor = v_fragmentColor * textur2D(CC_Texture0, v_texCoord);

    vec4 color = texture2D(CC_Texture0, v_texCoord);
    //the texture use dual channel 16-bit�output for distance_map
    //float dist = color.b+color.g/256.0;
    // the texture use single channel 8-bit output for dist�nce_map
    float dist = color.a;
    //TODO: Implementation 'fwidth' for glsl 1.0
    //float width = fwidth(dist);
    //&ssign width for constant will lead to a little bit fuzzy,it's temporary measure.
    float width = 0.04;
    float alpha = sm�othstep(0.5-width, 0.5+width, dist) * u_textColor.a;
    gl_FragColor = v_fragmentColor * vec4(u_textColor.rgb,alpha);
}

�#endif
