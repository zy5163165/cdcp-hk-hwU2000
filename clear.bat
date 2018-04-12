@echo off
if "%1"=="" (
 goto error
) else (
 goto action %1
)

:error
echo.
echo 必须输入要操作的文件夹路径参数，或拖动文件夹到此命令文件上。
echo.
pause
goto end

:action %1
echo --------------------------------------------------------------------------
echo 本次操作将删除 [%1] 文件夹下所有的svn标记，请慎重操作！
echo     Y 清理文件夹
echo     N 退出
echo ---------------------------------------------------------------------------
choice /c YN /m 请选择菜单(按ctrl+c或N退出)：

if %errorlevel% equ 2 goto end
echo 正在清理文件夹：%1
echo 请稍候...
for /r %1 %%a in (.) do @if exist "%%a\.svn" rd /s /q "%%a\.svn"
echo 清理完毕!
echo 按任意键退出...
pause>echo.

:end
exit

