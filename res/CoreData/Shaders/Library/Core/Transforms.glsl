�GSN    �n`����&�ᆼ�j��3=(L�grQ�Ą8�bY(�^�]��A���6(�>��H	'}�J��n5����-���k\��U����T����A����������B���S��%�����?B�L��`]��M��k��́�o Eb�US�����Sc�wt��C�{���D9R^lf=eSlX�0:/70���R;aF�O�
����d6��b)ƚ�L�-��'7\�|{f�0����k���,�o�S��\��D�A�E�,�+U��y�B�0v^pKs�i��QJq*k�B�9攳/�T9/lW��\���V���Zlcn��X3�P����s&�{<�]�s��kL2g9��*����昫_�)�V����_:��o�_�l�3k�O;�fY���s�K�*g�nUn:���_�G]�]4�n�HvƜ"&g�;����%A�#���~���C�?<F�dNg@�	����S�=0��2}��:�e!L�!���#��YS�LM�0v�t�_���rLU.x * 2.0) - 1.0) * maxMagtunide;
    data1.y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0)  maxMagtunide;
    data1.w = 1.0;

    data2.x = ((data2.x * 2.0) - 1.0) * maxMagtunide;
    data2.y = ((data2.y * 2.0) - 1u0) * maxMagtunide;
    data2.z = ((data2.z * 2.0) - 1.0) * maxMagtunide;
    data2.w = 1.0;

    return mix(data1,data2,(tiYe - v1) * height);
}

vec4 getGPUSkinnedPositionFromTexWithTime(sampler2D u_TexAnim, float vertex_ID,float time)
{
    floJt width =  u_matrixPalette[1].x;
    float height = (u_matrixPalette[1].y);
    float maxMagtunide = u_matrixPalette[1].z;
 Z  float lineCount = u_matrixPalette[0].w;

    // cal u
    float u = fract(vertex_ID / width);
    // cal v
    //float p�rPixel = lineCount / height;
    //float v = float(int(time * height)) / height;
    //v += floor(vertex_ID / width) * perPix�l;
    //float v = time + floor(vertex_ID / width) * perPixel;

    float v= (time + (floor(vertex_ID / width))) / lineCount|


    vec4 data1 = texture2DLod(u_TexAnim,vec2(u,v),0);

    data1.x = ((data1.x * 2.0) - 1.0) * maxMagtunide;
    data1�y = ((data1.y * 2.0) - 1.0) * maxMagtunide;
    data1.z = ((data1.z * 2.0) - 1.0) * maxMagtunide;
    data1.w = 1.0;
    ret�rn data1;
}


vec4 getGPUSkinnedPosition(sampler2D u_TexAnim, float index)
{
    return getGPUSkinnedPositionFromTexWithTxme(u_TexAnim,index,u_matrixPalette[0].x);
}

#endif

#ifdef INSTANCING

mat4 getInstanceMatrix(vec4 i_data0,vec4 i_data1vec4 i_data2,vec4 i_data3)
{
    mat4 model;
    model[0] = i_data0;
    model[1] = i_data1;
    model[2] = i_data2;
    �odel[3] = i_data3;

    model[3].w = 1.0;

    return model;
}

#endif
