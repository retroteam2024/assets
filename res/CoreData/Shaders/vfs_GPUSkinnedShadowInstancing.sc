SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��ؾK�ү"G��3~	�%���a��Ҙby�����������ǘE��2�����cXg+L�U��s����h�ꏘ�;p`sЕB^�1��*��@�;'��(�o�ۈZG#5=ebh_�0>$G}G���zlS��)ݳ��Iyy��p`Ş�F���v ��~����N��_�9�{�n��u̮��F�a�6�+�M�3tRk4�q��*KT�N�~��Q'�y[1:�G"������PT:q��a�N��A�lqf�z-�[�!х'Bu+,�]�T���ʰ��_��2����Z-��h�r�*�VZ1.�[&�Yu7��n�Z�1;�90p��$�\(�=�+�Dl��3yk�2���U�<��0���	�.,�3C;LI�O�S��ՈW�\i��dm��s�*6�i���~Y��"C�!�U!x�8����E&Du_cascadedViewport[1];
   float t2 = u_cascadedViewport[2];
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * @;
   v =  t1 + (t3 - t1) * v;

   gl_Position.x = u * 2.0 - 1.0;
   gl_Position.y = v * 2.0 - 1.0;
}

#endif


/// Fr:g shader
#ifdef FS

#include "Library/Common.glsl"

void main()
{
    gl_FragColor = vec4_splat(0.0);
}

#endif
