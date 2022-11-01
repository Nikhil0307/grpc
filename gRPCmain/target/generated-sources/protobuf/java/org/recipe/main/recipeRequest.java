// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Recipe.proto

package org.recipe.main;

/**
 * Protobuf type {@code org.recipe.main.recipeRequest}
 */
public  final class recipeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.recipe.main.recipeRequest)
    recipeRequestOrBuilder {
  // Use recipeRequest.newBuilder() to construct.
  private recipeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private recipeRequest() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private recipeRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            org.recipe.main.Recipe.Builder subBuilder = null;
            if (recipe_ != null) {
              subBuilder = recipe_.toBuilder();
            }
            recipe_ = input.readMessage(org.recipe.main.Recipe.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(recipe_);
              recipe_ = subBuilder.buildPartial();
            }

            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.recipe.main.RecipeOuterClass.internal_static_org_recipe_main_recipeRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.recipe.main.RecipeOuterClass.internal_static_org_recipe_main_recipeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.recipe.main.recipeRequest.class, org.recipe.main.recipeRequest.Builder.class);
  }

  public static final int RECIPE_FIELD_NUMBER = 1;
  private org.recipe.main.Recipe recipe_;
  /**
   * <code>.org.recipe.main.Recipe recipe = 1;</code>
   */
  public boolean hasRecipe() {
    return recipe_ != null;
  }
  /**
   * <code>.org.recipe.main.Recipe recipe = 1;</code>
   */
  public org.recipe.main.Recipe getRecipe() {
    return recipe_ == null ? org.recipe.main.Recipe.getDefaultInstance() : recipe_;
  }
  /**
   * <code>.org.recipe.main.Recipe recipe = 1;</code>
   */
  public org.recipe.main.RecipeOrBuilder getRecipeOrBuilder() {
    return getRecipe();
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (recipe_ != null) {
      output.writeMessage(1, getRecipe());
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (recipe_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getRecipe());
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.recipe.main.recipeRequest)) {
      return super.equals(obj);
    }
    org.recipe.main.recipeRequest other = (org.recipe.main.recipeRequest) obj;

    boolean result = true;
    result = result && (hasRecipe() == other.hasRecipe());
    if (hasRecipe()) {
      result = result && getRecipe()
          .equals(other.getRecipe());
    }
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRecipe()) {
      hash = (37 * hash) + RECIPE_FIELD_NUMBER;
      hash = (53 * hash) + getRecipe().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.recipe.main.recipeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.recipe.main.recipeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.recipe.main.recipeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.recipe.main.recipeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.recipe.main.recipeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.recipe.main.recipeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.recipe.main.recipeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.recipe.main.recipeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.recipe.main.recipeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.recipe.main.recipeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.recipe.main.recipeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.recipe.main.recipeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.recipe.main.recipeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.recipe.main.recipeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.recipe.main.recipeRequest)
      org.recipe.main.recipeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.recipe.main.RecipeOuterClass.internal_static_org_recipe_main_recipeRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.recipe.main.RecipeOuterClass.internal_static_org_recipe_main_recipeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.recipe.main.recipeRequest.class, org.recipe.main.recipeRequest.Builder.class);
    }

    // Construct using org.recipe.main.recipeRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      if (recipeBuilder_ == null) {
        recipe_ = null;
      } else {
        recipe_ = null;
        recipeBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.recipe.main.RecipeOuterClass.internal_static_org_recipe_main_recipeRequest_descriptor;
    }

    public org.recipe.main.recipeRequest getDefaultInstanceForType() {
      return org.recipe.main.recipeRequest.getDefaultInstance();
    }

    public org.recipe.main.recipeRequest build() {
      org.recipe.main.recipeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.recipe.main.recipeRequest buildPartial() {
      org.recipe.main.recipeRequest result = new org.recipe.main.recipeRequest(this);
      if (recipeBuilder_ == null) {
        result.recipe_ = recipe_;
      } else {
        result.recipe_ = recipeBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.recipe.main.recipeRequest) {
        return mergeFrom((org.recipe.main.recipeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.recipe.main.recipeRequest other) {
      if (other == org.recipe.main.recipeRequest.getDefaultInstance()) return this;
      if (other.hasRecipe()) {
        mergeRecipe(other.getRecipe());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.recipe.main.recipeRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.recipe.main.recipeRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private org.recipe.main.Recipe recipe_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.recipe.main.Recipe, org.recipe.main.Recipe.Builder, org.recipe.main.RecipeOrBuilder> recipeBuilder_;
    /**
     * <code>.org.recipe.main.Recipe recipe = 1;</code>
     */
    public boolean hasRecipe() {
      return recipeBuilder_ != null || recipe_ != null;
    }
    /**
     * <code>.org.recipe.main.Recipe recipe = 1;</code>
     */
    public org.recipe.main.Recipe getRecipe() {
      if (recipeBuilder_ == null) {
        return recipe_ == null ? org.recipe.main.Recipe.getDefaultInstance() : recipe_;
      } else {
        return recipeBuilder_.getMessage();
      }
    }
    /**
     * <code>.org.recipe.main.Recipe recipe = 1;</code>
     */
    public Builder setRecipe(org.recipe.main.Recipe value) {
      if (recipeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        recipe_ = value;
        onChanged();
      } else {
        recipeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.org.recipe.main.Recipe recipe = 1;</code>
     */
    public Builder setRecipe(
        org.recipe.main.Recipe.Builder builderForValue) {
      if (recipeBuilder_ == null) {
        recipe_ = builderForValue.build();
        onChanged();
      } else {
        recipeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.org.recipe.main.Recipe recipe = 1;</code>
     */
    public Builder mergeRecipe(org.recipe.main.Recipe value) {
      if (recipeBuilder_ == null) {
        if (recipe_ != null) {
          recipe_ =
            org.recipe.main.Recipe.newBuilder(recipe_).mergeFrom(value).buildPartial();
        } else {
          recipe_ = value;
        }
        onChanged();
      } else {
        recipeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.org.recipe.main.Recipe recipe = 1;</code>
     */
    public Builder clearRecipe() {
      if (recipeBuilder_ == null) {
        recipe_ = null;
        onChanged();
      } else {
        recipe_ = null;
        recipeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.org.recipe.main.Recipe recipe = 1;</code>
     */
    public org.recipe.main.Recipe.Builder getRecipeBuilder() {
      
      onChanged();
      return getRecipeFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.recipe.main.Recipe recipe = 1;</code>
     */
    public org.recipe.main.RecipeOrBuilder getRecipeOrBuilder() {
      if (recipeBuilder_ != null) {
        return recipeBuilder_.getMessageOrBuilder();
      } else {
        return recipe_ == null ?
            org.recipe.main.Recipe.getDefaultInstance() : recipe_;
      }
    }
    /**
     * <code>.org.recipe.main.Recipe recipe = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.recipe.main.Recipe, org.recipe.main.Recipe.Builder, org.recipe.main.RecipeOrBuilder> 
        getRecipeFieldBuilder() {
      if (recipeBuilder_ == null) {
        recipeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.recipe.main.Recipe, org.recipe.main.Recipe.Builder, org.recipe.main.RecipeOrBuilder>(
                getRecipe(),
                getParentForChildren(),
                isClean());
        recipe_ = null;
      }
      return recipeBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:org.recipe.main.recipeRequest)
  }

  // @@protoc_insertion_point(class_scope:org.recipe.main.recipeRequest)
  private static final org.recipe.main.recipeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.recipe.main.recipeRequest();
  }

  public static org.recipe.main.recipeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<recipeRequest>
      PARSER = new com.google.protobuf.AbstractParser<recipeRequest>() {
    public recipeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new recipeRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<recipeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<recipeRequest> getParserForType() {
    return PARSER;
  }

  public org.recipe.main.recipeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

