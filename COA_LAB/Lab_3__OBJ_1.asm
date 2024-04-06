;Aayush Sith
;2241010541

.data
count db 04h ;count=array size
value db 09h, 10h, 05h, 03h ;array elements
res db0 ;store the result is res

.code
main proc
    mov ax, data
    mov ds, ax
    mov cl, count
    dec cl
    LEA SI, value
    mov al, [SI]
up: inc si
    cmp al, [si]
    jnl nxt
    mov al, [si]
nxt:dec cl
    jnz up
    LEA DI, res
    mov[DI], al
  
  END MAIN     