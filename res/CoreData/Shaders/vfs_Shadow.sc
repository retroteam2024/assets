SSSS    �@♅�c�����?��U\I%�N.���/Z�p�f�}'�*�|���RM�� �i~lE�|��y~����$�+ٹ>]��
^,�o�݄����ER�ݔ�)������y�۾t��	�����~S|W�E��X��H��d�垍�55@i��:*�H�s���9t��K�r
֙�|X-5n+~lJ�l}yGxj��	�jfI�F�K����6
u��{dĕ�f�9ڶDT5d�.2w�0��_��|��+�W��G��#��D�-�A�"�&Zֺ:��vLms�s��VFx$&N�K�S��� �T<%sU��"�ж��Pyc8�	|�����kFe�C6�A�'��3L9gn�O�~���ի��@��}����n����?�MR*`�;�Q#RX��'��dh�
9g2��+�^&�EG�j�Ag��Ef.�b���5<�X���~���C�?R-�<O.v�$���ЂA�-��#��2�i1�l��;	���&�[O�d<�=�̪� ]9;
   float t3 = u_cascadedViewport[3];

   u =  t0 + (t2 - t0) * u;
   v =  t1 + (t3 - t1) * v;

   //gl_Position.x = u *2.0 - 1.0;
   //gl_Position.y = v * 2.0 - 1.0;

   v_position = gl_Position;
}

#endif


/// Frag shader
#ifdef FS
Q#define USING_INOUT_POSITION
#include "Library/Varying.glsl"


#include "Library/Common.glsl"

void main()
{
    //floa@ depth = v_position.z / v_position.w * 0.5 + 0.5;
    //gl_FragColor = vec4(EncodeDepth(depth),1.0);
    gl_FragColor = vec4_Xplat(0);
}

#endif
