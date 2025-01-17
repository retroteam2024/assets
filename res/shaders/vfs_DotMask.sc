SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��پK�٪'\��Fn�M���W���d�飗�����L���q��4�烄�bI1N�L��pà��$�𜁼|t86I|ۉr�.����';� �f�[7�Ī+s\I .y(I./�<%��O�akX��K����6
u��dp�/�&��kS2c�nt<�����r��m��A���$Į��N�c�q[��T�A�2zSq�?��d{x$f�S�q݈�[j�~lR��{������t0t��of���P��.@}�3,�	\�?�$_&+��e��%�蚋�	^��{��u�@C�B�r� �iT6g�t�Q/\���r�E�:b2�EsL?���s�B&E�S,�j�Rp��z`%�j����+Q�|���~���T�kCdQ�sH%\O�$���ڈY�Sw�����j2�d���#����j�xU�{�P���sYi
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transformF ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"

#include "o-erlay/DotMask.glsl"

void main()
{
   vec3 res = pow(texture2D(Source, vTexCoord).rgb, vec3(2.2,2.2,2.2));

   float mask= 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:
   //Output pixels are alternately tinted green and magenta
   veH3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
                             vec3(mask, 1.0, mask),
                            Zfloor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   {
      res *= dotMaskWeights;
   }
   else
   {
      res *= �ask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   }

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2, 1.0/2.2, 1.0/�.2)), 1.0);
}

#endif
