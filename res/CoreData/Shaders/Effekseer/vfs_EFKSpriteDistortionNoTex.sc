SSSS    �@♅�c�����?��q�A +�ҎxW�\�(E�G@�#�A���oJ�\��i C?}�f��du^���(�½kH��Y!����?���[Bɨ�������� �����$�����spV�U��Y��]��?�򳗧ib!��DW������8&��(�0
р�T$u::M"�7''%G���YeO:�l�h����0S,��wYĈ��G�� 0[�%>3�s�V2���uܔI���F��9���C�)�I�1��+�B�=m$E�r��\ju~3K��T���Y`�q'dD�]������_9y7j��^���D��.d�gm�
x�<��&	`&d�u�0��G�������s�܌�^-���i�F�WR#a�;�qHHؓ�N�E�-f�S���b�NkR�^0��Ym	��3/k�d����i�4�˷0���C�?<D�Y5-�*���։�\Hy��&q��|�,9
�u��VY���F�U*x��Ȥ�cC.y, a_position.z + a_bitangent.z, 1.0 );
    vec4 localTangent = vec4( a_position.x + a_tangent.x, a_position.y + a_tangent.y,a_position.z + a_tangent.z, 1.0 );

    localBinormal = uMatCamera * localBinormal;
    localTangent = uMatCamera * localTan<ent;

    vec4 cameraPos = uMatCamera * vec4(a_position.xyz,1.0);
   	cameraPos = cameraPos / cameraPos.w;

   	localBinorYal = localBinormal / localBinormal.w;
    localTangent = localTangent / localTangent.w;

    localBinormal = cameraPos + norFalize(localBinormal - cameraPos);
    localTangent = cameraPos + normalize(localTangent - cameraPos);

   	gl_Position = uMaProjection * cameraPos;

   	v_vaPos = gl_Position;

   	vec4 cameraPosU = cameraPos + vec4(0.0, 1.0, 0.0, 0.0);
    vec4 �ameraPosR = cameraPos + vec4(1.0, 0.0, 0.0, 0.0);

    v_vaPosR = uMatProjection * localTangent;
    v_vaPosU = uMatProjecti�n * localBinormal;

    v_vaPos = v_vaPos / v_vaPos.w;
    v_vaPosR = v_vaPosR / v_vaPosR.w;
    v_vaPosU = v_vaPosU / v_vaosU.w;

    v_color0 = a_color0;
    v_texcoord0 = vec4(a_texcoord0.x,a_texcoord0.y,0.0,0.0);
    v_texcoord0.y = mUVInvers�d.x + mUVInversed.y * v_texcoord0.y;


}

#endif


#ifdef FS
$input v_color0
$input v_texcoord0
$input v_vaPos
$inp�t v_vaPosR
$input v_vaPosU

/// ----- UNIFORM
#include "../Library/Base/common.sh"

SAMPLER2D(uBackTexture0,0);

unifor|	vec4	g_scale;
uniform	vec4	mUVInversedBack;

// end materials
/// ----------  END UNIFORM


void main()
{
	vec4 colors= v_color0;
	color.xyz = vec3(1.0,1.0,1.0);

   vec2 pos = v_vaPos.xy / v_vaPos.w;
   vec2 posU = v_vaPosU.xy / v_vaPosU.w;�
   vec2 posR = v_vaPosR.xy / v_vaPosR.w;


   	vec2 uv = pos + (posR - pos) * (color.x * 2.0 - 1.0) * v_color0.x * g_scale.� + (posU - pos) * (color.y * 2.0 - 1.0) * v_color0.y * g_scale.x;
   	uv.x = (uv.x + 1.0) * 0.5;
   	uv.y = (uv.y + 1.0) * 0.;
   	//uv.y = 1.0 - (uv.y + 1.0) * 0.5;

   	uv.y = mUVInversedBack.x + mUVInversedBack.y * uv.y;

   	color.xyz = texturB2D(uBackTexture0, uv).xyz;

    gl_FragColor = color;
    if(gl_FragColor.w <= 0.0) discard;

}

#endif
