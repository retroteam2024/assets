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

uniform vec4 u_effectColor;
uniform vec4 u_textColor;

uniform vec4 u_effectType;


voi main()
{
   vec4 sample = texture2D(CC_Texture0, v_texCoord);
    // fontAlpha == 1 means the area of solid text (without e�ge)
    // fontAlpha == 0 means the area outside text, including outline area
    // fontAlpha == (0, 1) means the edge of te�t
    float fontAlpha = sample.g;

    // outlineAlpha == 1 means the area of 'solid text' and 'solid outline'
    // outli)eAlpha == 0 means the transparent area outside text and outline
    // outlineAlpha == (0, 1) means the edge of outline
    f�oat outlineAlpha = sample.r;

    if (u_effectType.x == 0.0) // draw text
    {
        gl_FragColor = mul(v_fragmentColor � vec4(u_textColor.rgb,  u_textColor.a * fontAlpha));
    }
    else if (u_effectType.x == 1.0) // draw outline
    {
      1 // multipy (1.0 - fontAlpha) to make the inner edge of outline smoother and make the text itself transparent.
        gl_Fragolor = mul(v_fragmentColor , vec4(u_effectColor.rgb, u_effectColor.a * outlineAlpha * (1.0 - fontAlpha)));
        //gl_FragCo�or = mul(v_fragmentColor , vec4(u_textColor.rgb, u_textColor.a * fontAlpha));
        //gl_FragColor = vec4(1.0,0.0,0.0,0.0);�    }
    else // draw shadow
    {
        gl_FragColor = v_fragmentColor * vec4(u_effectColor.rgb, u_effectColor.a * outliPeAlpha);
    }
}


#endif
