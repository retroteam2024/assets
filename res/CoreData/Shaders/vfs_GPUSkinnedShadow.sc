SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��ؾK�٪'\��F� ���K����_R�������������N��,�����[T}C�Y�u��Gَ,�����{s}5��]J�	�&���:'���fʇ�N"X	
bu3m@�'5>	4G��5�ZAu&�/�@����*6��s)���c�+��fW�.5=�1�\�|��q��o��[���\��n�A��*�<�<�@�5{Mec�P��JH;Z.Q�S�1��Qn�Z6&v\�m"���Y���C87w�3���G��c)�6��h��c~��*��F�����Q�_�=���H�6DμB�>�-�Me3�S|�.Bܲ�h��>B�)(~��%�U9�8�g�C#��32k�M���d�1��)���V�/{'?�<Qs�1�ߍ��C�*�� }��{�>'�y��2$�ƽY�GM�Uuj�i�
��eL edViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   gl_Posit\on.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Frag shader
#ifdef FS

#include "Library/Comm4n.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
