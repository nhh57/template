package org.example.template.utils.errorcodes;

import com.backbase.helper.common.error.ErrorCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum BackbaseTemplateErrorCodes implements ErrorCode {
    ;

    private final String key;
}
