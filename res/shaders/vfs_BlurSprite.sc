�GSN    �@♅�c�����?��USk�UV���iX�s>-�{�l6�.�k���|#���<!0 N�J��HHu��پK�٪'\��Fn�M���W���d�飗�����L���q��4�烄�bI1N�L��pà��$�𜁼|t86I|ۉr�.����';� �f�[7�Ī+s\I .y(I./�<%��O�akX��K����6
u��dp�/�&��kS2c�nt<�����r��m��A���$Į��N�c�q[��T�A�2zSq�?��d{x$f�S�q݈�[j�~lR��{������t0t��of���P��.@}�3,�	\�?�$_&+��e��%�蚋�	^��{��u�@C�B�r� �iT6g�t�Q/\���r�E�:b2�EsL?���s�B&E�S,�j�Rp��z`%�j����+Q�|���~���T�kCdQ�sH%\O�$���ڈY�Sw�����j2�d���#����j�xU�{�P���sYi
#define USING_INOUT_TEXCOORD0
#include "../CoreData/Shaders/Library/Varying.glsl"

/// Common (uniforms,samplers, transformF ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shaders/Library/Lighting.glsl"


vec4 blurn(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
  vec4 color = vec4(0.0);
  vec2 off1 = vec2(1.3333333333333333 * direction;
  color += texture2D(image, uv) * 0.29411764705882354;
  color += texture2D(image, uv + (off1 / resolution)) * .35294117647058826;
  color += texture2D(image, uv - (off1 / resolution)) * 0.35294117647058826;
  return color;
}

vec4 bur13(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
  vec4 color = vec4(0.0);
  vec2 off1 = vec2(1.411764705882�53) * direction;
  vec2 off2 = vec2(3.2941176470588234) * direction;
  vec2 off3 = vec2(5.176470588235294) * direction;
  co�or += texture2D(image, uv) * 0.1964825501511404;
  color += texture2D(image, uv + (off1 / resolution)) * 0.2969069646728344;
g color += texture2D(image, uv - (off1 / resolution)) * 0.2969069646728344;
  color += texture2D(image, uv + (off2 / resolution�) * 0.09447039785044732;
  color += texture2D(image, uv - (off2 / resolution)) * 0.09447039785044732;
  color += texture2D(im�ge, uv + (off3 / resolution)) * 0.010381362401148057;
  color += texture2D(image, uv - (off3 / resolution)) * 0.01038136240114)057;
  return color;
}

vec4 blur9(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
  vec4 color = vec4(0.0);Y  vec2 off1 = vec2(1.3846153846) * direction;
  vec2 off2 = vec2(3.2307692308) * direction;
  color += texture2D(image, uv) *�0.2270270270;
  color += texture2D(image, uv + (off1 / resolution)) * 0.3162162162;
  color += texture2D(image, uv - (off1 / �esolution)) * 0.3162162162;
  color += texture2D(image, uv + (off2 / resolution)) * 0.0702702703;
  color += texture2D(image,uv - (off2 / resolution)) * 0.0702702703;
  return color;
}


//void main()
//{
//    vec4 texColor = blur9(u_diffuseTexv_texcoord0,vec2(50,100),vec2(0.5,0.5));
//    gl_FragColor.rgb = texColor.rgb;
//    gl_FragColor.a = 1.0;
//}

#define L,NGTH 0.0075

void main()
{
    vec4 color = texture2D(u_diffuseTex,v_texcoord0);
     vec4 sum = vec4(0.0);

           m/ blur in y (vertical) take nine samples, with the distance LENGTH between them
           //sum += texture2D(u_diffuseTex, ve2(v_texcoord0.x - 4.0 * LENGTH, v_texcoord0.y)) * 0.05;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 3.0 * LNGTH, v_texcoord0.y)) * 0.09;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x - 2.0 * LENGTH, v_texcoord0.y)) * 0�12;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x -       LENGTH, v_texcoord0.y)) * 0.15;
           sum += te�ture2D(u_diffuseTex, vec2(v_texcoord0.x, v_texcoord0.y)) * 0.16;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x 2       LENGTH, v_texcoord0.y)) * 0.15;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 2.0 * LENGTH, v_texcoord�.y)) * 0.12;
           sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 3.0 * LENGTH, v_texcoord0.y)) * 0.09;
           /sum += texture2D(u_diffuseTex, vec2(v_texcoord0.x + 4.0 * LENGTH, v_texcoord0.y)) * 0.05;

           gl_FragColor = sum;
}�


#endif
