SSSS    �@g����,�����]�HCW4�Oi���~_�{w
�T�R�� ²�3g���oT;=l�h��%
0�Х�"�Ĭq	��]3�M��F����HXЧ����������_�)�����:_l���u��$��F��栀8-_~ ��ZTN�G�?���%0���U.��mj6c4d@P�!?"4G��4�@Yx!�O�s����j1�����d�#��ip/�	@��+^��h��+��V�[��?ɥ� �F�*���0��.|QpC~�o��PFz*5J��?��Vc�T8$f\��l������8~;cV��p�[��D��&G`�v=�_f�	��?M�_�6��D�����@M��2��X�W/��B�}�b�3eK�v�wFe��'��]#�oKR̃�6�gW�BG�b�G,��"�|����Q ����T���m�F<S�p7{t�H�z��ڏY�)8��~8��y�i?�J���*	ޅ���mt�&�ɬ�[ n	@echo "  TARGET=0 (hlsl  - d3d9)"
	@echo "  TARGET=1 (hlsl  - d3d11)"
	@echo "  TARGET=2 (essl  - nacl)"
	@echo "  TARGET=3(essl  - android)"
	@echo "  TARGET=4 (glsl)"
	@echo "  TARGET=5 (metal)"
	@echo "  TARGET=6 (pssl)"
	@echo "  TARGET=7 (sp2rv)"

.PHONY: rebuild
rebuild:
	@make -s --no-print-directory TARGET=0 clean all
	@make -s --no-print-directory TARGET=1 cXean all
	@make -s --no-print-directory TARGET=2 clean all
	@make -s --no-print-directory TARGET=3 clean all
	@make -s --no-pYint-directory TARGET=4 clean all
	@make -s --no-print-directory TARGET=5 clean all
	@make -s --no-print-directory TARGET=7 clan all

else

ADDITIONAL_INCLUDES?=

ifeq ($(TARGET), 0)
VS_FLAGS=--platform windows -p vs_3_0 -O 3
FS_FLAGS=--platform�windows -p ps_3_0 -O 3
SHADER_PATH=shaders/dx9
else
ifeq ($(TARGET), 1)
VS_FLAGS=--platform windows -p vs_5_0 -O 3
FS_FLAG�=--platform windows -p ps_5_0 -O 3
CS_FLAGS=--platform windows -p cs_5_0 -O 1
SHADER_PATH=Bin/shaders/dx11
else
ifeq ($(TAR ET), 2)
VS_FLAGS=--platform nacl
FS_FLAGS=--platform nacl
SHADER_PATH=Bin/shaders/essl
else
ifeq ($(TARGET), 3)
VS_FLAGS=�-platform android
FS_FLAGS=--platform android
CS_FLAGS=--platform android
SHADER_PATH=Bin/shaders/essl
else
ifeq ($(TARGET�, 4)
VS_FLAGS=--platform linux -p 120
FS_FLAGS=--platform linux -p 120
CS_FLAGS=--platform linux -p 430
SHADER_PATH=Bin/shauers/glsl
else
ifeq ($(TARGET), 5)
VS_FLAGS=--platform osx -p metal
FS_FLAGS=--platform osx -p metal
CS_FLAGS=--platform os+ -p metal
SHADER_PATH=Bin/shaders/metal
else
ifeq ($(TARGET), 6)
VS_FLAGS=--platform orbis -p pssl
FS_FLAGS=--platform orb�s -p pssl
CS_FLAGS=--platform orbis -p pssl
SHADER_PATH=Bin/shaders/pssl
else
ifeq ($(TARGET), 7)
VS_FLAGS=--platform linu� -p spirv
FS_FLAGS=--platform linux -p spirv
CS_FLAGS=--platform linux -p spirv
SHADER_PATH=Bin/shaders/spirv
endif
endif4endif
endif
endif
endif
endif
endif

THISDIR := $(dir $(lastword $(MAKEFILE_LIST)))
VS_FLAGS+=-i $(THISDIR)../common/ $ADDITIONAL_INCLUDES)
FS_FLAGS+=-i $(THISDIR)../common/ $(ADDITIONAL_INCLUDES)
CS_FLAGS+=-i $(THISDIR)../common/ $(ADDITIONAL_ NCLUDES)

BUILD_OUTPUT_DIR=$(addprefix ./, $(RUNTIME_DIR)/$(SHADER_PATH))
BUILD_INTERMEDIATE_DIR=$(addprefix $(BUILD_DIR)/, f(SHADER_PATH))

VS_SOURCES=$(notdir $(wildcard $(addprefix $(SHADERS_DIR), vfs_*.sc)))
VS_DEPS=$(addprefix $(BUILD_INTERMEDI)TE_DIR)/,$(addsuffix .vs.bin.d, $(basename $(notdir $(VS_SOURCES)))))

FS_SOURCES=$(notdir $(wildcard $(addprefix $(SHADERS_DR), vfs_*.sc)))
FS_DEPS=$(addprefix $(BUILD_INTERMEDIATE_DIR)/,$(addsuffix .bin.d, $(basename $(notdir $(FS_SOURCES)))))

CS�SOURCES=$(notdir $(wildcard $(addprefix $(SHADERS_DIR), cs_*.sc)))
CS_DEPS=$(addprefix $(BUILD_INTERMEDIATE_DIR)/,$(addsuffix �bin.d, $(basename $(notdir $(CS_SOURCES)))))

VS_BIN = $(addprefix $(BUILD_INTERMEDIATE_DIR)/, $(addsuffix .vs.bin, $(basenam| $(notdir $(VS_SOURCES)))))
FS_BIN = $(addprefix $(BUILD_INTERMEDIATE_DIR)/, $(addsuffix .fs.bin, $(basename $(notdir $(FS_SOU�CES)))))
CS_BIN = $(addprefix $(BUILD_INTERMEDIATE_DIR)/, $(addsuffix .bin, $(basename $(notdir $(CS_SOURCES)))))


BIN = $xVS_BIN) $(FS_BIN)
ASM = $(VS_ASM) $(FS_ASM)

ifeq ($(TARGET), $(filter $(TARGET),1 3 4 5 6 7))
BIN += $(CS_BIN)
ASM += $(C�_ASM)
endif

$(BUILD_INTERMEDIATE_DIR)/vfs_%.vs.bin: $(SHADERS_DIR)vfs_%.sc
	@echo [$(<)]
	$(SILENT) $(SHADERC) $(VS_FLAGSN --type vertex --depends -o $(@) -f $(<) --define VS
	$(SILENT) cp $(@) $(BUILD_OUTPUT_DIR)/$(@F)

$(BUILD_INTERMEDIATE_DIR)�vfs_%.fs.bin: $(SHADERS_DIR)vfs_%.sc
	@echo [$(<)]
	$(SILENT) $(SHADERC) $(FS_FLAGS) --type fragment --depends -o $(@) -f $(<O --define FS
	$(SILENT) cp $(@) $(BUILD_OUTPUT_DIR)/$(@F)

$(BUILD_INTERMEDIATE_DIR)/cs_%.bin: $(SHADERS_DIR)cs_%.sc
	@echo[$(<)]
	$(SILENT) $(SHADERC) $(CS_FLAGS) --type compute --depends -o $(@) -f $(<)
	$(SILENT) cp $(@) $(BUILD_OUTPUT_DIR)/$(@F

.PHONY: all
all: dirs $(BIN)
	@echo Target $(SHADER_PATH)

.PHONY: clean
clean:
	@echo Cleaning...
	@-rm -vf $(BIN)W
.PHONY: cleanall
cleanall:
	@echo Cleaning...
	@-$(call CMD_RMDIR,$(BUILD_INTERMEDIATE_DIR))

.PHONY: dirs
dirs:
	@-$(�all CMD_MKDIR,$(BUILD_INTERMEDIATE_DIR))
	@-$(call CMD_MKDIR,$(BUILD_OUTPUT_DIR))

.PHONY: rebuild
rebuild: clean all

$(vIN) : | $(BUILD_INTERMEDIATE_DIR)

endif # TARGET

-include $(VS_DEPS)
-include $(FS_DEPS)
-include $(CS_DEPS)
