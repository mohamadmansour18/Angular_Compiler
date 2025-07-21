parser grammar FrameParser;

options { tokenVocab=FrameLexer; }

//<img src="image.png" alt="description" />
htmlImageTag
    : IMG_TAG_OPEN imgAttribute* IMG_TAG_SELF_CLOSE
    ;

imgAttribute
    : SRC EQ STRING
    | ALT EQ STRING
    ;