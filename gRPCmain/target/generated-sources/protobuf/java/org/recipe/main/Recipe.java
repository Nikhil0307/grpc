// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Recipe.proto

package org.recipe.main;

/**
 * Protobuf type {@code org.recipe.main.Recipe}
 */
public  final class Recipe extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.recipe.main.Recipe)
    RecipeOrBuilder {
  // Use Recipe.newBuilder() to construct.
  private Recipe(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Recipe() {
    recipe_ = "";
    process_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Recipe(
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
            java.lang.String s = input.readStringRequireUtf8();

            recipe_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            process_ = s;
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
    return org.recipe.main.RecipeOuterClass.internal_static_org_recipe_main_Recipe_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.recipe.main.RecipeOuterClass.internal_static_org_recipe_main_Recipe_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.recipe.main.Recipe.class, org.recipe.main.Recipe.Builder.class);
  }

  public static final int RECIPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object recipe_;
  /**
   * <code>string recipe = 1;</code>
   */
  public java.lang.String getRecipe() {
    java.lang.Object ref = recipe_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recipe_ = s;
      return s;
    }
  }
  /**
   * <code>string recipe = 1;</code>
   */
  public com.google.protobuf.ByteString
      getRecipeBytes() {
    java.lang.Object ref = recipe_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recipe_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROCESS_FIELD_NUMBER = 2;
  private volatile java.lang.Object process_;
  /**
   * <code>string process = 2;</code>
   */
  public java.lang.String getProcess() {
    java.lang.Object ref = process_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      process_ = s;
      return s;
    }
  }
  /**
   * <code>string process = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProcessBytes() {
    java.lang.Object ref = process_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      process_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getRecipeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, recipe_);
    }
    if (!getProcessBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, process_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRecipeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, recipe_);
    }
    if (!getProcessBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, process_);
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
    if (!(obj instanceof org.recipe.main.Recipe)) {
      return super.equals(obj);
    }
    org.recipe.main.Recipe other = (org.recipe.main.Recipe) obj;

    boolean result = true;
    result = result && getRecipe()
        .equals(other.getRecipe());
    result = result && getProcess()
        .equals(other.getProcess());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RECIPE_FIELD_NUMBER;
    hash = (53 * hash) + getRecipe().hashCode();
    hash = (37 * hash) + PROCESS_FIELD_NUMBER;
    hash = (53 * hash) + getProcess().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.recipe.main.Recipe parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.recipe.main.Recipe parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.recipe.main.Recipe parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.recipe.main.Recipe parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.recipe.main.Recipe parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.recipe.main.Recipe parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.recipe.main.Recipe parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.recipe.main.Recipe parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.recipe.main.Recipe parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.recipe.main.Recipe parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.recipe.main.Recipe parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.recipe.main.Recipe parseFrom(
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
  public static Builder newBuilder(org.recipe.main.Recipe prototype) {
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
   * Protobuf type {@code org.recipe.main.Recipe}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.recipe.main.Recipe)
      org.recipe.main.RecipeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.recipe.main.RecipeOuterClass.internal_static_org_recipe_main_Recipe_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.recipe.main.RecipeOuterClass.internal_static_org_recipe_main_Recipe_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.recipe.main.Recipe.class, org.recipe.main.Recipe.Builder.class);
    }

    // Construct using org.recipe.main.Recipe.newBuilder()
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
      recipe_ = "";

      process_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.recipe.main.RecipeOuterClass.internal_static_org_recipe_main_Recipe_descriptor;
    }

    public org.recipe.main.Recipe getDefaultInstanceForType() {
      return org.recipe.main.Recipe.getDefaultInstance();
    }

    public org.recipe.main.Recipe build() {
      org.recipe.main.Recipe result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.recipe.main.Recipe buildPartial() {
      org.recipe.main.Recipe result = new org.recipe.main.Recipe(this);
      result.recipe_ = recipe_;
      result.process_ = process_;
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
      if (other instanceof org.recipe.main.Recipe) {
        return mergeFrom((org.recipe.main.Recipe)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.recipe.main.Recipe other) {
      if (other == org.recipe.main.Recipe.getDefaultInstance()) return this;
      if (!other.getRecipe().isEmpty()) {
        recipe_ = other.recipe_;
        onChanged();
      }
      if (!other.getProcess().isEmpty()) {
        process_ = other.process_;
        onChanged();
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
      org.recipe.main.Recipe parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.recipe.main.Recipe) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object recipe_ = "";
    /**
     * <code>string recipe = 1;</code>
     */
    public java.lang.String getRecipe() {
      java.lang.Object ref = recipe_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recipe_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string recipe = 1;</code>
     */
    public com.google.protobuf.ByteString
        getRecipeBytes() {
      java.lang.Object ref = recipe_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recipe_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string recipe = 1;</code>
     */
    public Builder setRecipe(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recipe_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string recipe = 1;</code>
     */
    public Builder clearRecipe() {
      
      recipe_ = getDefaultInstance().getRecipe();
      onChanged();
      return this;
    }
    /**
     * <code>string recipe = 1;</code>
     */
    public Builder setRecipeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recipe_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object process_ = "";
    /**
     * <code>string process = 2;</code>
     */
    public java.lang.String getProcess() {
      java.lang.Object ref = process_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        process_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string process = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProcessBytes() {
      java.lang.Object ref = process_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        process_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string process = 2;</code>
     */
    public Builder setProcess(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      process_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string process = 2;</code>
     */
    public Builder clearProcess() {
      
      process_ = getDefaultInstance().getProcess();
      onChanged();
      return this;
    }
    /**
     * <code>string process = 2;</code>
     */
    public Builder setProcessBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      process_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:org.recipe.main.Recipe)
  }

  // @@protoc_insertion_point(class_scope:org.recipe.main.Recipe)
  private static final org.recipe.main.Recipe DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.recipe.main.Recipe();
  }

  public static org.recipe.main.Recipe getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Recipe>
      PARSER = new com.google.protobuf.AbstractParser<Recipe>() {
    public Recipe parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new Recipe(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Recipe> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Recipe> getParserForType() {
    return PARSER;
  }

  public org.recipe.main.Recipe getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
