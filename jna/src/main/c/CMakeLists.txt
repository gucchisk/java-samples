cmake_minimum_required(VERSION 2.8)

project(jna)

set(CMAKE_MACOSX_RPATH ON)

add_library(jna SHARED lib.c)

add_executable(test main.c)
target_link_libraries(test jna)
