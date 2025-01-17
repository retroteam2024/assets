SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��پK�٪'\��Fn�M���W���d�飗�����L���q��4�烄�bI1N�L��pà��$�𜁼|t86I|ۉr�.����';� �f�[7�Ī+sQL%5xm<_Hw�(3��%�JEs:�W�����(>��4'���n�/��=?=� ?v�.�5���~��j��\���%��i�l��l���6�B�)wVbh�n��Sfk/Q�H�3���!�]\@&Y��w�öT���vj&\��<�	��G�lm`�a8��'҉$< 3��S��F�����@W��2�ӈ�L���3�>�A H�~�|Hů�4��n [�,5S���n�hV�d}��PP��v/=�q�Ҡ�5O�y���p���(�{Cz[�y8{��	��ςU�TUm��t4��"�y~s�.���`G����]X�{=�"���@6T,480.0)

void main()
{
    gl_Position = mul(u_viewProjMatrix , vec4(a_position.xyz,1.0));
    v_texcoord0 = a_texcoord0.xL;
    float size = 20.0;
    v_texcoord1 = vec2(pi * size * OutputSize.x, 2.0 * pi * TextureSize.y);
}
#endif

#ifdef FSQ
/// input
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_TEXCOORD1
#include "../CoreData/Shaders/Library/Varying.glsl">
/// Common (uniforms,samplers, transforms ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/ShJders/Library/Lighting.glsl"

#include "overlay/Scanlines.glsl"


void main()
{
   vec2 sine_comp = vec2(SCANLINE_SINE_CO7P_A, SCANLINE_SINE_COMP_B);
   vec3 res = COMPAT_TEXTURE(Source, vTexCoord).xyz;
   vec3 scanline = res * (SCANLINE_BASE_BRIG�TNESS + dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y, scanline.z� 1.0);
}

#endif
