SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��پK�٪'\��F� ���K����_R�������������-��o�𿞜bIh�E��z��z���͢��%!OtY�� t�m��=��
�wv�G�u���@"LD+uz!`#4�OYxH~G���fd@��a����d_z��wg؝�s�9��gpG�Kxz�>��V�n��j��q�D��8����.�N�*�6��*|\0Co���TE{k3F�B�*뒡2�~'%lT��k���{���?T8c8��E|���V��*Ng�z7�G�)ѐFf2g�P�~��\�����M�X�w��K�-��M�b�x�r!�w�}ѯ�`�E�-a�ji?��&�u_�=��@#��g;k�}����l�u���?ղ�W�rIxW�JSbUI�O�S΍���*��'w��|�gZt�-��fM����s�.1�i�N���T'D   modelView[0][1] = 0.0; 
    modelView[0][2] = 0.0; 

    // Second colunm.
    modelView[1][0] = 0.0; 
    modelView[1]n1] = 1.0; 
    modelView[1][2] = 0.0; 

    // Thrid colunm.
    modelView[2][0] = 0.0; 
    modelView[2][1] = 0.0; 
    6odelView[2][2] = 1.0;

    // fixed-size billboard
    // https://stackoverflow.com/questions/41767490/how-to-transform-vert]ces-in-vertex-shader-to-get-a-3d-billboard

    vec4 viewPos = mul(u_modelView, u_billboardCenter);
    float dist = -viewPoX.z * 0.005;
    //gl_Position = mul(u_proj, (viewPos + vec4(a_position.xy*dist, 0, 0)));
    
    gl_Position = mul(u_proj, ul(modelView, vec4(a_position.xyz * dist, 1.0)));

    #include "Library/Macro/Texcoord0Final.glsl"
}

#endif

#ifdef FS�

/// input
#define USING_INOUT_TEXCOORD0
#include "Library/Varying.glsl"

/// Common (uniforms,samplers, transforms ... )�
#include "Library/Common.glsl"
#include "Library/Lighting.glsl"

void main()
{
    vec4 texColor = texture2D(u_diffuseTexk v_texcoord0);
    gl_FragColor = vec4(texColor.rgb, texColor.a);
}

#endif
