SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��پK�٪'\��Fn�M���W���d�飗�����L���q��4�烄�bI1N�L��pà��$�𜁼|t86I|ۉr�.����';� �f�[7�Ī+s\I .y(I./�<%��O�akX��K����6
u��dp�/�&��kS2c�nt<�����r��m��A���$Į��N�c�q[��T�A�2zSq�?��d{x$f�S�q݈�[j�~lR��{������t0t��of���P��.@}�3,�	\�?�$_&+��e��%�蚋�	^��{��u�@C�B�r� �iT6g�t�Q/\���r�E�:b2�EsL?���s�B&E�S,�j�Rp��z`%�j����+Q�|���~���T�kCdQ�sH%\O�$���ڈY�Sw�����j2�d���#����j�xU�{�P���sYi
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transformF ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"
SAMPLER2D(u_p:letteTex,1);

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float W = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = textuYe2D(u_paletteTex, curPt).rgb;
    gl_FragColor.a = 1.0;
}

#endif
