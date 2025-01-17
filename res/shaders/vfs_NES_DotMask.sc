SSSS    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��پK�٪'\��Fn�M���W���d�飗�����L���q��4�烄�bI1N�L��pà��$�𜁼|t86I|ۉr�.����';� �f�[7�Ī+s\I .y(I./�<%��O�akX��K����6
u��dp�/�&��kS2c�nt<�����r��m��A���$Į��N�c�q[��T�A�2zSq�?��d{x$f�S�q݈�[j�~lR��{������t0t��of���P��.@}�3,�	\�?�$_&+��e��%�蚋�	^��{��u�@C�B�r� �iT6g�t�Q/\���r�E�:b2�EsL?���s�B&E�S,�j�Rp��z`%�j����+Q�|���~���T�kCdQ�sH%\O�$���ڈY�Sw�����j2�d���#����j�xU�{�P���sYi
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transformF ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"
SAMPLER2D(u_p:letteTex,1);

void _main_()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    floa@ c = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = tex_ure2D(u_paletteTex, curPt).rgb;
    gl_FragColor.a = 1.0;
}

#include "overlay/DotMask.glsl"

void main()
{
   vec4 tex9olor = texture2D(u_diffuseTex,v_texcoord0);
   float a = texColor.a;
   float c = floor((a * 256.0) / 127.5);
   float x = a�- c * 0.001953;
   vec2 curPt = vec2(x, 0.0);


   vec3 res = pow(texture2D(u_paletteTex, curPt).rgb, vec3(2.2,2.2,2.2));
�
   float mask = 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:
   //Output pixels are alternately tinted green andgmagenta
   vec3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
                             vec3(mask, 1.0, mask),
             �               floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   {
      res *= dotMaskWeights;
   }
   else
   {�
      res *= Mask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   }

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2= 1.0/2.2, 1.0/2.2)), 1.0);
}

#endif
