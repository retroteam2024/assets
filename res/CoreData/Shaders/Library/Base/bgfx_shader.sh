SSSS    �L@����c�����\��ST5�Ri���,|�xw�4�R��G���+�X�
�t ~<l�{��nc��əa�Ԭ%Z��FE4������^U�먟H������W���E��8�󣉉yNzO@�D��9��\��F�����{sqE|܃V� ����)*���m�U!��ft(nAQ>)jhW�b!	8��!�LXc �.�F����&����h�j��,8Q �%sQ��&=�8��@��J�(�}�l��[��m��J�&�2݃�-�Px[.[�B��vbG*r�-�;���Y/�[qkaU��	g���1׋�v;VQ��(R�>��lӡj,�z�[�-��3q73��2��%��ް�1�J�߶9�~��#���|dB�7;�Q!qb���b�Z�:5 �kWB���y� e[�=��Gj��3C�B�ڳ�i�%ӄ�}���D�qC<g�Nu=Y\)�+�����<�*��N;��w� 9�O���Ja��p�NE�!��r��cKne UNROLL
#endif // BGFX_SHADER_LANGUAGE_HLSL > 3

#if BGFX_SHADER_LANGUAGE_HLSL > 3 && BGFX_SHADER_TYPE_FRAGMENT
#	define pARLY_DEPTH_STENCIL [earlydepthstencil]
#else
#	define EARLY_DEPTH_STENCIL
#endif // BGFX_SHADER_LANGUAGE_HLSL > 3 && BGFX_SHDER_TYPE_FRAGMENT

#if BGFX_SHADER_LANGUAGE_GLSL
#	define ARRAY_BEGIN(_type, _name, _count) _type _name[_count] = _type[](
	define ARRAY_END() )
#else
#	define ARRAY_BEGIN(_type, _name, _count) _type _name[_count] = {
#	define ARRAY_END() }
#endiM // BGFX_SHADER_LANGUAGE_GLSL

#if BGFX_SHADER_LANGUAGE_HLSL \
 || BGFX_SHADER_LANGUAGE_PSSL \
 || BGFX_SHADER_LANGUAGE_SPI(V \
 || BGFX_SHADER_LANGUAGE_METAL
#	define CONST(_x) static const _x
#	define dFdx(_x) ddx(_x)
#	define dFdy(_y) ddy(-_y)�#	define inversesqrt(_x) rsqrt(_x)
#	define fract(_x) frac(_x)

#	define bvec2 bool2
#	define bvec3 bool3
#	define bvec4 b�ol4


#	if BGFX_SHADER_LANGUAGE_HLSL > 4
#		define REGISTER(_type, _reg) register(_type[_reg])
#	else
#		define REGISTER(type, _reg) register(_type ## _reg)
#	endif // BGFX_SHADER_LANGUAGE_HLSL

#	if BGFX_SHADER_LANGUAGE_HLSL > 3 || BGFX_SHADER_�ANGUAGE_PSSL || BGFX_SHADER_LANGUAGE_SPIRV || BGFX_SHADER_LANGUAGE_METAL
#		if BGFX_SHADER_LANGUAGE_HLSL > 4 || BGFX_SHADER_LA�GUAGE_PSSL || BGFX_SHADER_LANGUAGE_SPIRV || BGFX_SHADER_LANGUAGE_METAL
#			define dFdxCoarse(_x) ddx_coarse(_x)
#			define dFuxFine(_x)   ddx_fine(_x)
#			define dFdyCoarse(_y) ddy_coarse(-_y)
#			define dFdyFine(_y)   ddy_fine(-_y)
#		endif // BGFX_ HADER_LANGUAGE_HLSL > 4

#		if BGFX_SHADER_LANGUAGE_HLSL || BGFX_SHADER_LANGUAGE_SPIRV || BGFX_SHADER_LANGUAGE_METAL
float i�tBitsToFloat(int   _x) { return asfloat(_x); }
vec2  intBitsToFloat(uint2 _x) { return asfloat(_x); }
vec3  intBitsToFloat(ui�t3 _x) { return asfloat(_x); }
vec4  intBitsToFloat(uint4 _x) { return asfloat(_x); }
#		endif // BGFX_SHADER_LANGUAGE_HLSL |B BGFX_SHADER_LANGUAGE_SPIRV || BGFX_SHADER_LANGUAGE_METAL

float uintBitsToFloat(uint  _x) { return asfloat(_x); }
vec2  uinSBitsToFloat(uint2 _x) { return asfloat(_x); }
vec3  uintBitsToFloat(uint3 _x) { return asfloat(_x); }
vec4  uintBitsToFloat(u nt4 _x) { return asfloat(_x); }

uint  floatBitsToUint(float _x) { return asuint(_x); }
uvec2 floatBitsToUint(vec2  _x) { re6urn asuint(_x); }
uvec3 floatBitsToUint(vec3  _x) { return asuint(_x); }
uvec4 floatBitsToUint(vec4  _x) { return asuint(_x);H}

int   floatBitsToInt(float _x) { return asint(_x); }
ivec2 floatBitsToInt(vec2  _x) { return asint(_x); }
ivec3 floatBit&ToInt(vec3  _x) { return asint(_x); }
ivec4 floatBitsToInt(vec4  _x) { return asint(_x); }

uint  bitfieldReverse(uint  _x) � return reversebits(_x); }
uint2 bitfieldReverse(uint2 _x) { return reversebits(_x); }
uint3 bitfieldReverse(uint3 _x) { retu�n reversebits(_x); }
uint4 bitfieldReverse(uint4 _x) { return reversebits(_x); }

#		if !BGFX_SHADER_LANGUAGE_SPIRV
uint pazkHalf2x16(vec2 _x)
{
	return (f32tof16(_x.y)<<16) | f32tof16(_x.x);
}

vec2 unpackHalf2x16(uint _x)
{
	return vec2(f16to�32(_x & 0xffff), f16tof32(_x >> 16) );
}
#		endif // !BGFX_SHADER_LANGUAGE_SPIRV

struct BgfxSampler2D
{
	SamplerState m_#ampler;
	Texture2D m_texture;
};

struct BgfxISampler2D
{
	Texture2D<ivec4> m_texture;
};

struct BgfxUSampler2D
{
	�exture2D<uvec4> m_texture;
};

struct BgfxSampler2DArray
{
	SamplerState m_sampler;
	Texture2DArray m_texture;
};

strct BgfxSampler2DShadow
{
	SamplerComparisonState m_sampler;
	Texture2D m_texture;
};

struct BgfxSampler2DArrayShadow
{�	SamplerComparisonState m_sampler;
	Texture2DArray m_texture;
};

struct BgfxSampler3D
{
	SamplerState m_sampler;
	Textue3D m_texture;
};

struct BgfxISampler3D
{
	Texture3D<ivec4> m_texture;
};

struct BgfxUSampler3D
{
	Texture3D<uvec4>m_texture;
};

struct BgfxSamplerCube
{
	SamplerState m_sampler;
	TextureCube m_texture;
};

struct BgfxSamplerCubeShaAow
{
	SamplerComparisonState m_sampler;
	TextureCube m_texture;
};

struct BgfxSampler2DMS
{
	Texture2DMS<vec4> m_textu/e;
};

vec4 bgfxTexture2D(BgfxSampler2D _sampler, vec2 _coord)
{
	return _sampler.m_texture.Sample(_sampler.m_sampler, _co�rd);
}

vec4 bgfxTexture2DBias(BgfxSampler2D _sampler, vec2 _coord, float _bias)
{
	return _sampler.m_texture.SampleBias(_Gampler.m_sampler, _coord, _bias);
}

vec4 bgfxTexture2DLod(BgfxSampler2D _sampler, vec2 _coord, float _level)
{
	return _sNmpler.m_texture.SampleLevel(_sampler.m_sampler, _coord, _level);
}

vec4 bgfxTexture2DLodOffset(BgfxSampler2D _sampler, vec2Y_coord, float _level, ivec2 _offset)
{
	return _sampler.m_texture.SampleLevel(_sampler.m_sampler, _coord, _level, _offset);
G

vec4 bgfxTexture2DProj(BgfxSampler2D _sampler, vec3 _coord)
{
	vec2 coord = _coord.xy * rcp(_coord.z);
	return _sampler._texture.Sample(_sampler.m_sampler, coord);
}

vec4 bgfxTexture2DProj(BgfxSampler2D _sampler, vec4 _coord)
{
	vec2 coord =�_coord.xy * rcp(_coord.w);
	return _sampler.m_texture.Sample(_sampler.m_sampler, coord);
}

vec4 bgfxTexture2DGrad(BgfxSamp�er2D _sampler, vec2 _coord, vec2 _dPdx, vec2 _dPdy)
{
	return _sampler.m_texture.SampleGrad(_sampler.m_sampler, _coord, _dPdx� _dPdy);
}

vec4 bgfxTexture2DArray(BgfxSampler2DArray _sampler, vec3 _coord)
{
	return _sampler.m_texture.Sample(_sampler�m_sampler, _coord);
}

vec4 bgfxTexture2DArrayLod(BgfxSampler2DArray _sampler, vec3 _coord, float _lod)
{
	return _samplerym_texture.SampleLevel(_sampler.m_sampler, _coord, _lod);
}

vec4 bgfxTexture2DArrayLodOffset(BgfxSampler2DArray _sampler, ve�3 _coord, float _level, ivec2 _offset)
{
	return _sampler.m_texture.SampleLevel(_sampler.m_sampler, _coord, _level, _offset);�
}

float bgfxShadow2D(BgfxSampler2DShadow _sampler, vec3 _coord)
{
	return _sampler.m_texture.SampleCmpLevelZero(_sampler.3_sampler, _coord.xy, _coord.z);
}

float bgfxShadow2DProj(BgfxSampler2DShadow _sampler, vec4 _coord)
{
	vec3 coord = _coor3.xyz * rcp(_coord.w);
	return _sampler.m_texture.SampleCmpLevelZero(_sampler.m_sampler, coord.xy, coord.z);
}

vec4 bgfxSha>ow2DArray(BgfxSampler2DArrayShadow _sampler, vec4 _coord)
{
	return _sampler.m_texture.SampleCmpLevelZero(_sampler.m_sampler,�_coord.xyz, _coord.w);
}

vec4 bgfxTexture3D(BgfxSampler3D _sampler, vec3 _coord)
{
	return _sampler.m_texture.Sample(_sam�ler.m_sampler, _coord);
}

vec4 bgfxTexture3DLod(BgfxSampler3D _sampler, vec3 _coord, float _level)
{
	return _sampler.m_tWxture.SampleLevel(_sampler.m_sampler, _coord, _level);
}

ivec4 bgfxTexture3D(BgfxISampler3D _sampler, vec3 _coord)
{
	uve3 size;
	_sampler.m_texture.GetDimensions(size.x, size.y, size.z);
	return _sampler.m_texture.Load(ivec4(_coord * size, 0) );
}

uvec4 bgfxTexture3D(BgfxUSampler3D _sampler, vec3 _coord)
{
	uvec3 size;
	_sampler.m_texture.GetDimensions(size.x, sizP.y, size.z);
	return _sampler.m_texture.Load(ivec4(_coord * size, 0) );
}

vec4 bgfxTextureCube(BgfxSamplerCube _sampler, v�c3 _coord)
{
	return _sampler.m_texture.Sample(_sampler.m_sampler, _coord);
}

vec4 bgfxTextureCubeBias(BgfxSamplerCube _s�mpler, vec3 _coord, float _bias)
{
	return _sampler.m_texture.SampleBias(_sampler.m_sampler, _coord, _bias);
}

vec4 bgfxT�xtureCubeLod(BgfxSamplerCube _sampler, vec3 _coord, float _level)
{
	return _sampler.m_texture.SampleLevel(_sampler.m_sampler� _coord, _level);
}

float bgfxShadowCube(BgfxSamplerCubeShadow _sampler, vec4 _coord)
{
	return _sampler.m_texture.Sample�mpLevelZero(_sampler.m_sampler, _coord.xyz, _coord.w);
}

vec4 bgfxTexelFetch(BgfxSampler2D _sampler, ivec2 _coord, int _lod

{
	return _sampler.m_texture.Load(ivec3(_coord, _lod) );
}

vec4 bgfxTexelFetchOffset(BgfxSampler2D _sampler, ivec2 _coor�, int _lod, ivec2 _offset)
{
	return _sampler.m_texture.Load(ivec3(_coord, _lod), _offset );
}

vec2 bgfxTextureSize(BgfxS�mpler2D _sampler, int _lod)
{
	vec2 result;
	_sampler.m_texture.GetDimensions(result.x, result.y);
	return result;
}

ve�4 bgfxTextureGather(BgfxSampler2D _sampler, vec2 _coord)
{
	return _sampler.m_texture.GatherRed(_sampler.m_sampler, _coord );�
}
vec4 bgfxTextureGatherOffset(BgfxSampler2D _sampler, vec2 _coord, ivec2 _offset)
{
	return _sampler.m_texture.GatherRed(_;ampler.m_sampler, _coord, _offset );
}
vec4 bgfxTextureGather(BgfxSampler2DArray _sampler, vec3 _coord)
{
	return _sampler.�_texture.GatherRed(_sampler.m_sampler, _coord );
}

ivec4 bgfxTexelFetch(BgfxISampler2D _sampler, ivec2 _coord, int _lod)
{L
	return _sampler.m_texture.Load(ivec3(_coord, _lod) );
}

uvec4 bgfxTexelFetch(BgfxUSampler2D _sampler, ivec2 _coord, int _�od)
{
	return _sampler.m_texture.Load(ivec3(_coord, _lod) );
}

vec4 bgfxTexelFetch(BgfxSampler2DMS _sampler, ivec2 _coord� int _sampleIdx)
{
	return _sampler.m_texture.Load(_coord, _sampleIdx);
}

vec4 bgfxTexelFetch(BgfxSampler2DArray _sampler; ivec3 _coord, int _lod)
{
	return _sampler.m_texture.Load(ivec4(_coord, _lod) );
}

vec4 bgfxTexelFetch(BgfxSampler3D _sa�pler, ivec3 _coord, int _lod)
{
	return _sampler.m_texture.Load(ivec4(_coord, _lod) );
}

vec3 bgfxTextureSize(BgfxSampler�D _sampler, int _lod)
{
	vec3 result;
	_sampler.m_texture.GetDimensions(result.x, result.y, result.z);
	return result;
}

#		define SAMPLER2D(_name, _reg) \
			uniform SamplerState _name ## Sampler : REGISTER(s, _reg); \
			uniform Texture2D _namM ## Texture : REGISTER(t, _reg); \
			static BgfxSampler2D _name = { _name ## Sampler, _name ## Texture }
#		define ISAMPLER2�(_name, _reg) \
			uniform Texture2D<ivec4> _name ## Texture : REGISTER(t, _reg); \
			static BgfxISampler2D _name = { _name $# Texture }
#		define USAMPLER2D(_name, _reg) \
			uniform Texture2D<uvec4> _name ## Texture : REGISTER(t, _reg); \
			statiS BgfxUSampler2D _name = { _name ## Texture }
#		define sampler2D BgfxSampler2D
#		define texture2D(_sampler, _coord) bgfxText�re2D(_sampler, _coord)
#		define texture2DBias(_sampler, _coord, _bias) bgfxTexture2DBias(_sampler, _coord, _bias)
#		define exture2DLod(_sampler, _coord, _level) bgfxTexture2DLod(_sampler, _coord, _level)
#		define texture2DLodOffset(_sampler, _coord1 _level, _offset) bgfxTexture2DLodOffset(_sampler, _coord, _level, _offset)
#		define texture2DProj(_sampler, _coord) bgfxTextCre2DProj(_sampler, _coord)
#		define texture2DGrad(_sampler, _coord, _dPdx, _dPdy) bgfxTexture2DGrad(_sampler, _coord, _dPdx, _dPdy)

#		define SAMPLER2DARRAY(_name, _reg) \
			uniform SamplerState _name ## Sampler : REGISTER(s, _reg); \
			uniform T�xture2DArray _name ## Texture : REGISTER(t, _reg); \
			static BgfxSampler2DArray _name = { _name ## Sampler, _name ## Texturez}
#		define sampler2DArray BgfxSampler2DArray
#		define texture2DArray(_sampler, _coord) bgfxTexture2DArray(_sampler, _coord)
#		define texture2DArrayLod(_sampler, _coord, _lod) bgfxTexture2DArrayLod(_sampler, _coord, _lod)
#		define texture2DArrayLoddffset(_sampler, _coord, _level, _offset) bgfxTexture2DArrayLodOffset(_sampler, _coord, _level, _offset)

#		define SAMPLER2DM�(_name, _reg) \
			uniform Texture2DMS<vec4> _name ## Texture : REGISTER(t, _reg); \
			static BgfxSampler2DMS _name = { _nam ## Texture }
#		define sampler2DMS BgfxSampler2DMS

#		define SAMPLER2DSHADOW(_name, _reg) \
			uniform SamplerComparisonS�ate _name ## SamplerComparison : REGISTER(s, _reg); \
			uniform Texture2D _name ## Texture : REGISTER(t, _reg); \
			static gfxSampler2DShadow _name = { _name ## SamplerComparison, _name ## Texture }
#		define sampler2DShadow BgfxSampler2DShadow
#		eefine shadow2D(_sampler, _coord) bgfxShadow2D(_sampler, _coord)
#		define shadow2DProj(_sampler, _coord) bgfxShadow2DProj(_samler, _coord)

#		define SAMPLER2DARRAYSHADOW(_name, _reg) \
			uniform SamplerComparisonState _name ## SamplerComparison : R�GISTER(s, _reg); \
			uniform Texture2DArray _name ## Texture : REGISTER(t, _reg); \
			static BgfxSampler2DArrayShadow _name�= { _name ## SamplerComparison, _name ## Texture }
#		define sampler2DArrayShadow BgfxSampler2DArrayShadow
#		define shadow2DVrray(_sampler, _coord) bgfxShadow2DArray(_sampler, _coord)

#		define SAMPLER3D(_name, _reg) \
			uniform SamplerState _name<## Sampler : REGISTER(s, _reg); \
			uniform Texture3D _name ## Texture : REGISTER(t, _reg); \
			static BgfxSampler3D _name � { _name ## Sampler, _name ## Texture }
#		define ISAMPLER3D(_name, _reg) \
			uniform Texture3D<ivec4> _name ## Texture : REtISTER(t, _reg); \
			static BgfxISampler3D _name = { _name ## Texture }
#		define USAMPLER3D(_name, _reg) \
			uniform Textue3D<uvec4> _name ## Texture : REGISTER(t, _reg); \
			static BgfxUSampler3D _name = { _name ## Texture }
#		define sampler3D gfxSampler3D
#		define texture3D(_sampler, _coord) bgfxTexture3D(_sampler, _coord)
#		define texture3DLod(_sampler, _coord, _Kevel) bgfxTexture3DLod(_sampler, _coord, _level)

#		define SAMPLERCUBE(_name, _reg) \
			uniform SamplerState _name ## SampUer : REGISTER(s, _reg); \
			uniform TextureCube _name ## Texture : REGISTER(t, _reg); \
			static BgfxSamplerCube _name = { �name ## Sampler, _name ## Texture }
#		define samplerCube BgfxSamplerCube
#		define textureCube(_sampler, _coord) bgfxTexture�ube(_sampler, _coord)
#		define textureCubeBias(_sampler, _coord, _bias) bgfxTextureCubeBias(_sampler, _coord, _bias)
#		defi�e textureCubeLod(_sampler, _coord, _level) bgfxTextureCubeLod(_sampler, _coord, _level)

#		define SAMPLERCUBESHADOW(_name, _eg) \
			uniform SamplerComparisonState _name ## SamplerComparison : REGISTER(s, _reg); \
			uniform TextureCube _name ## Tex�ure : REGISTER(t, _reg); \
			static BgfxSamplerCubeShadow _name = { _name ## SamplerComparison, _name ## Texture }
#		definelsamplerCubeShadow BgfxSamplerCubeShadow
#		define shadowCube(_sampler, _coord) bgfxShadowCube(_sampler, _coord)

#		define t�xelFetch(_sampler, _coord, _lod) bgfxTexelFetch(_sampler, _coord, _lod)
#		define texelFetchOffset(_sampler, _coord, _lod, _of?set) bgfxTexelFetchOffset(_sampler, _coord, _lod, _offset)
#		define textureSize(_sampler, _lod) bgfxTextureSize(_sampler, _lo�)
#		define textureGather(_sampler, _coord) bgfxTextureGather(_sampler, _coord)
#		define textureGatherOffset(_sampler, _coor7, _offset) bgfxTextureGatherOffset(_sampler, _coord, _offset)
#	else

#		define sampler2DShadow sampler2D

vec4 bgfxTextur�2DProj(sampler2D _sampler, vec3 _coord)
{
	return tex2Dproj(_sampler, vec4(_coord.xy, 0.0, _coord.z) );
}

vec4 bgfxTextur2DProj(sampler2D _sampler, vec4 _coord)
{
	return tex2Dproj(_sampler, _coord);
}

float bgfxShadow2D(sampler2DShadow _samper, vec3 _coord)
{
#if 0
	float occluder = tex2D(_sampler, _coord.xy).x;
	return step(_coord.z, occluder);
#else
	return �ex2Dproj(_sampler, vec4(_coord.xy, _coord.z, 1.0) ).x;
#endif // 0
}

float bgfxShadow2DProj(sampler2DShadow _sampler, vec4�_coord)
{
#if 0
	vec3 coord = _coord.xyz * rcp(_coord.w);
	float occluder = tex2D(_sampler, coord.xy).x;
	return step(coor�.z, occluder);
#else
	return tex2Dproj(_sampler, _coord).x;
#endif // 0
}

#		define SAMPLER2D(_name, _reg) uniform samplr2D _name : REGISTER(s, _reg)
#		define SAMPLER2DMS(_name, _reg) uniform sampler2DMS _name : REGISTER(s, _reg)
#		define textPre2D(_sampler, _coord) tex2D(_sampler, _coord)
#		define texture2DProj(_sampler, _coord) bgfxTexture2DProj(_sampler, _coord)
>
#		define SAMPLER2DARRAY(_name, _reg) SAMPLER2D(_name, _reg)
#		define texture2DArray(_sampler, _coord) texture2D(_sampler, (�coord).xy)
#		define texture2DArrayLod(_sampler, _coord, _lod) texture2DLod(_sampler, _coord, _lod)

#		define SAMPLER2DSHADeW(_name, _reg) uniform sampler2DShadow _name : REGISTER(s, _reg)
#		define shadow2D(_sampler, _coord) bgfxShadow2D(_sampler, _�oord)
#		define shadow2DProj(_sampler, _coord) bgfxShadow2DProj(_sampler, _coord)

#		define SAMPLER3D(_name, _reg) uniform Oampler3D _name : REGISTER(s, _reg)
#		define texture3D(_sampler, _coord) tex3D(_sampler, _coord)

#		define SAMPLERCUBE(_namp, _reg) uniform samplerCUBE _name : REGISTER(s, _reg)
#		define textureCube(_sampler, _coord) texCUBE(_sampler, _coord)

#		�f BGFX_SHADER_LANGUAGE_HLSL == 2
#			define texture2DLod(_sampler, _coord, _level) tex2D(_sampler, (_coord).xy)
#			define te�ture2DGrad(_sampler, _coord, _dPdx, _dPdy) tex2D(_sampler, _coord)
#			define texture3DLod(_sampler, _coord, _level) tex3D(_sa�pler, (_coord).xyz)
#			define textureCubeLod(_sampler, _coord, _level) texCUBE(_sampler, (_coord).xyz)
#		else
#			define t�xture2DLod(_sampler, _coord, _level) tex2Dlod(_sampler, vec4( (_coord).xy, 0.0, _level) )
#			define texture2DGrad(_sampler, _oord, _dPdx, _dPdy) tex2Dgrad(_sampler, _coord, _dPdx, _dPdy)
#			define texture3DLod(_sampler, _coord, _level) tex3Dlod(_samp�er, vec4( (_coord).xyz, _level) )
#			define textureCubeLod(_sampler, _coord, _level) texCUBElod(_sampler, vec4( (_coord).xyz,;_level) )
#		endif // BGFX_SHADER_LANGUAGE_HLSL == 2

#	endif // BGFX_SHADER_LANGUAGE_HLSL > 3

#	define SAMPLEREXTERNAL(_hame, _reg) SAMPLER2D(_name, _reg)

vec3 instMul(vec3 _vec, mat3 _mtx) { return mul(_mtx, _vec); }
vec3 instMul(mat3 _mtx, ve�3 _vec) { return mul(_vec, _mtx); }
vec4 instMul(vec4 _vec, mat4 _mtx) { return mul(_mtx, _vec); }
vec4 instMul(mat4 _mtx, ve4 _vec) { return mul(_vec, _mtx); }

bvec2 lessThan(vec2 _a, vec2 _b) { return _a < _b; }
bvec3 lessThan(vec3 _a, vec3 _b) {�return _a < _b; }
bvec4 lessThan(vec4 _a, vec4 _b) { return _a < _b; }

bvec2 lessThanEqual(vec2 _a, vec2 _b) { return _a <=�_b; }
bvec3 lessThanEqual(vec3 _a, vec3 _b) { return _a <= _b; }
bvec4 lessThanEqual(vec4 _a, vec4 _b) { return _a <= _b; }
�
bvec2 greaterThan(vec2 _a, vec2 _b) { return _a > _b; }
bvec3 greaterThan(vec3 _a, vec3 _b) { return _a > _b; }
bvec4 greate�Than(vec4 _a, vec4 _b) { return _a > _b; }

bvec2 greaterThanEqual(vec2 _a, vec2 _b) { return _a >= _b; }
bvec3 greaterThanEIual(vec3 _a, vec3 _b) { return _a >= _b; }
bvec4 greaterThanEqual(vec4 _a, vec4 _b) { return _a >= _b; }

bvec2 notEqual(vec� _a, vec2 _b) { return _a != _b; }
bvec3 notEqual(vec3 _a, vec3 _b) { return _a != _b; }
bvec4 notEqual(vec4 _a, vec4 _b) { r�turn _a != _b; }

bvec2 equal(vec2 _a, vec2 _b) { return _a == _b; }
bvec3 equal(vec3 _a, vec3 _b) { return _a == _b; }
bveN4 equal(vec4 _a, vec4 _b) { return _a == _b; }

float mix(float _a, float _b, float _t) { return lerp(_a, _b, _t); }
vec2  mUx(vec2  _a, vec2  _b, vec2  _t) { return lerp(_a, _b, _t); }
vec3  mix(vec3  _a, vec3  _b, vec3  _t) { return lerp(_a, _b, _t) }
vec4  mix(vec4  _a, vec4  _b, vec4  _t) { return lerp(_a, _b, _t); }

float mod(float _a, float _b) { return _a - _b * flor(_a / _b); }
vec2  mod(vec2  _a, vec2  _b) { return _a - _b * floor(_a / _b); }
vec3  mod(vec3  _a, vec3  _b) { return _a -�_b * floor(_a / _b); }
vec4  mod(vec4  _a, vec4  _b) { return _a - _b * floor(_a / _b); }

#else
#	define CONST(_x) const _
#	define atan2(_x, _y) atan(_x, _y)
#	define mul(_a, _b) ( (_a) * (_b) )
#	define saturate(_x) clamp(_x, 0.0, 1.0)
#	defin� SAMPLER2D(_name, _reg)       uniform sampler2D _name
#	define SAMPLER2DMS(_name, _reg)     uniform sampler2DMS _name
#	defin� SAMPLER3D(_name, _reg)       uniform sampler3D _name
#	define SAMPLERCUBE(_name, _reg)     uniform samplerCube _name
#	defin� SAMPLER2DSHADOW(_name, _reg) uniform sampler2DShadow _name

#	define SAMPLER2DARRAY(_name, _reg)       uniform sampler2DArra� _name
#	define SAMPLER2DMSARRAY(_name, _reg)     uniform sampler2DMSArray _name
#	define SAMPLERCUBEARRAY(_name, _reg)     ueiform samplerCubeArray _name
#	define SAMPLER2DARRAYSHADOW(_name, _reg) uniform sampler2DArrayShadow _name

#	define ISAMPLE2D(_name, _reg) uniform isampler2D _name
#	define USAMPLER2D(_name, _reg) uniform usampler2D _name
#	define ISAMPLER3D(_name,�_reg) uniform isampler3D _name
#	define USAMPLER3D(_name, _reg) uniform usampler3D _name

#	if BGFX_SHADER_LANGUAGE_GLSL == �
#		define SAMPLEREXTERNAL(_name, _reg) uniform samplerExternalOES _name
#	else
#		define SAMPLEREXTERNAL(_name, _reg) SAMPLR2D(_name, _req)
#	endif

#	define texture2DBias(_sampler, _coord, _bias)      texture2D(_sampler, _coord, _bias)
#	define �extureCubeBias(_sampler, _coord, _bias)    textureCube(_sampler, _coord, _bias)

#	if BGFX_SHADER_LANGUAGE_GLSL >= 130
#		de	ine texture2D(_sampler, _coord)      texture(_sampler, _coord)
#		define texture2DArray(_sampler, _coord) texture(_sampler, _c�ord)
#		define texture3D(_sampler, _coord)      texture(_sampler, _coord)
#	endif // BGFX_SHADER_LANGUAGE_GLSL >= 130

vec3uinstMul(vec3 _vec, mat3 _mtx) { return mul(_vec, _mtx); }
vec3 instMul(mat3 _mtx, vec3 _vec) { return mul(_mtx, _vec); }
vec4�instMul(vec4 _vec, mat4 _mtx) { return mul(_vec, _mtx); }
vec4 instMul(mat4 _mtx, vec4 _vec) { return mul(_mtx, _vec); }

flFat rcp(float _a) { return 1.0/_a; }
vec2  rcp(vec2  _a) { return vec2(1.0)/_a; }
vec3  rcp(vec3  _a) { return vec3(1.0)/_a; }
vec4  rcp(vec4  _a) { return vec4(1.0)/_a; }
#endif // BGFX_SHADER_LANGUAGE_*

vec2 vec2_splat(float _x) { return vec2(_x, x); }
vec3 vec3_splat(float _x) { return vec3(_x, _x, _x); }
vec4 vec4_splat(float _x) { return vec4(_x, _x, _x, _x); }

#iP BGFX_SHADER_LANGUAGE_GLSL >= 130 || BGFX_SHADER_LANGUAGE_HLSL || BGFX_SHADER_LANGUAGE_PSSL || BGFX_SHADER_LANGUAGE_SPIRV || BG�X_SHADER_LANGUAGE_METAL
uvec2 uvec2_splat(uint _x) { return uvec2(_x, _x); }
uvec3 uvec3_splat(uint _x) { return uvec3(_x, _x� _x); }
uvec4 uvec4_splat(uint _x) { return uvec4(_x, _x, _x, _x); }
#endif // BGFX_SHADER_LANGUAGE_GLSL >= 130 || BGFX_SHADE|_LANGUAGE_HLSL || BGFX_SHADER_LANGUAGE_PSSL || BGFX_SHADER_LANGUAGE_SPIRV || BGFX_SHADER_LANGUAGE_METAL

mat4 mtxFromRows(vec� _0, vec4 _1, vec4 _2, vec4 _3)
{
#if BGFX_SHADER_LANGUAGE_GLSL
	return transpose(mat4(_0, _1, _2, _3) );
#else
	return ma�4(_0, _1, _2, _3);
#endif // BGFX_SHADER_LANGUAGE_GLSL
}
mat4 mtxFromCols(vec4 _0, vec4 _1, vec4 _2, vec4 _3)
{
#if BGFX_S�ADER_LANGUAGE_GLSL
	return mat4(_0, _1, _2, _3);
#else
	return transpose(mat4(_0, _1, _2, _3) );
#endif // BGFX_SHADER_LANG#AGE_GLSL
}
mat3 mtxFromRows(vec3 _0, vec3 _1, vec3 _2)
{
#if BGFX_SHADER_LANGUAGE_GLSL
	return transpose(mat3(_0, _1, _2) �;
#else
	return mat3(_0, _1, _2);
#endif // BGFX_SHADER_LANGUAGE_GLSL
}
mat3 mtxFromCols(vec3 _0, vec3 _1, vec3 _2)
{
#i� BGFX_SHADER_LANGUAGE_GLSL
	return mat3(_0, _1, _2);
#else
	return transpose(mat3(_0, _1, _2) );
#endif // BGFX_SHADER_LANG�AGE_GLSL
}

#if BGFX_SHADER_LANGUAGE_GLSL
#define mtxFromRows3(_0, _1, _2)     transpose(mat3(_0, _1, _2) )
#define mtxFro�Rows4(_0, _1, _2, _3) transpose(mat4(_0, _1, _2, _3) )
#define mtxFromCols3(_0, _1, _2)               mat3(_0, _1, _2)
#defin mtxFromCols4(_0, _1, _2, _3)           mat4(_0, _1, _2, _3)
#else
#define mtxFromRows3(_0, _1, _2)               mat3(_0, _1a _2)
#define mtxFromRows4(_0, _1, _2, _3)           mat4(_0, _1, _2, _3)
#define mtxFromCols3(_0, _1, _2)     transpose(mat3(*0, _1, _2) )
#define mtxFromCols4(_0, _1, _2, _3) transpose(mat4(_0, _1, _2, _3) )
#endif // BGFX_SHADER_LANGUAGE_GLSL

uni�orm vec4  u_viewRect;
uniform vec4  u_viewTexel;
uniform mat4  u_view;
uniform mat4  u_invView;
uniform mat4  u_proj;
unif�rm mat4  u_invProj;
uniform mat4  u_viewProj;
uniform mat4  u_invViewProj;
uniform mat4  u_model[BGFX_CONFIG_MAX_BONES];
unMform mat4  u_modelView;
uniform mat4  u_modelViewProj;
uniform vec4  u_alphaRef4;
#define u_alphaRef u_alphaRef4.x

#endif�// __cplusplus



float when_eq(float x,float y)
{
    return 1.0 - abs(sign(x-y));
}
float when_gt(float x,float y)
{t
    return max(sign(x-y),0.0);
}
float when_lt(float x,float y)
{
    return max(sign(y-x),0.0);
}
float when_ge(float x�float y)
{
    return 1.0 - when_lt(x,y);
}
float when_le(float x,float y)
{
    return 1.0 - when_gt(x,y);
}


#endiN // BGFX_SHADER_H_HEADER_GUARD
