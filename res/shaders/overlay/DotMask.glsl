SSSS    �n`��Î&�����F��H�S{���4R�sx�#�|4�=�e����?�+�,ZPSD*�{��eb�������{϶l$�������g^���V��������N��`�𿘏rj=F�F��g��Q��h�ኝ�^mIb�BC���6���3d��\�F���H>PZ~)#i8iRP�'s!2U��R�':Z�R�7ڐ�� <��s)��q�>��3;�"i;�i�WN�B��)���T�W�@��v����p�9���m�6�$mJvI�g�::a�s�&���Z\�4c%��v���VŶ�Aj&K�� 3���L�7r`�vT�\Q�.֊.L}2+��;��M�Ѹ��J��{���X�~γB�'�<�Mh,t�R�|_Р�i��0q=�Kzu1���_�E\�B|�s�@P��al.�{����%K�:���7��Z�0O]�nYF�k�~䂖�e�6��)y��<�C!�>�zB���A�XC�\R�Y�_���eDmask = vec3(maskDark, maskDark, maskDark);

   // Very compressed TV style shadow mask.
   if (shadowMask == 1.0)
   {
     float line = maskLight;
      float odd  = 0.0;

      if (fract(pos.x/6.0) < 0.5)
         odd = 1.0;
      if (fract((+os.y + odd)/2.0) < 0.5)
         line = maskDark;

      pos.x = fract(pos.x/3.0);

      if      (pos.x < 0.333) mask.r =maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                    mask.b = maskLight;
      mask*=lBne;
   }

   // Aperture-grille.
   else if (shadowMask == 2.0)
   {
      pos.x = fract(pos.x/3.0);

      if      (po	.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else                    mask.b = mask�ight;
   }

   // Stretched VGA style shadow mask (same as prior shaders).
   else if (shadowMask == 3.0)
   {
      pos.� += pos.y*3.0;
      pos.x  = fract(pos.x/6.0);

      if      (pos.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0i666) mask.g = maskLight;
      else                    mask.b = maskLight;
   }

   // VGA style shadow mask.
   else if (�hadowMask == 4.0)
   {
      pos.xy = floor(pos.xy*vec2(1.0, 0.5));
      pos.x += pos.y*3.0;
      pos.x  = fract(pos.x/6.�);

      if      (pos.x < 0.333) mask.r = maskLight;
      else if (pos.x < 0.666) mask.g = maskLight;
      else         1          mask.b = maskLight;
   }

   return mask;
}

//void main()
//{
//    vec4 texColor = texture2D(u_diffuseTex,vtexcoord0);
//    gl_FragColor.rgb = texColor.rgb;
//    gl_FragColor.a = 1.0;
//}

void main_()
{
   vec3 res = pow(tex�ure2D(Source, vTexCoord).rgb, vec3(2.2,2.2,2.2));

   float mask = 1.0 - DOTMASK_STRENGTH;

   //cgwg's dotmask emulation:�   //Output pixels are alternately tinted green and magenta
   vec3 dotMaskWeights = mix(vec3(1.0, mask, 1.0),
                            vec3(mask, 1.0, mask),
                             floor(mod(mod_factor, 2.0)));
   if (shadowMask == 0.)
   \
      res *= dotMaskWeights;
   }
   else
   {
      res *= Mask(floor(1.000001 * gl_FragCoord.xy + vec2(0.5,0.5)));
   

      gl_FragColor = vec4(pow(res, vec3(1.0/2.2, 1.0/2.2, 1.0/2.2)), 1.0);
}